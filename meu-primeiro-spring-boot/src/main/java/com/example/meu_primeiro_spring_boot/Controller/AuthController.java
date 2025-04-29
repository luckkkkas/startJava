package com.example.meu_primeiro_spring_boot.Controller;


import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_spring_boot.Models.Usuario;
import com.example.meu_primeiro_spring_boot.Services.UsuarioService;
import com.example.meu_primeiro_spring_boot.security.JWTUtil;


@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UsuarioService usuarioservice;

    public AuthController(UsuarioService usuarioService){
        this.usuarioservice = usuarioService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody Map<String, String> request){
        
        Usuario usuario = usuarioservice.registrarUsuario(request.get("username"), request.get("password"));
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<?> logarUsuario(@RequestBody Map<String, String> entity) {
        Optional<Usuario> usuario = usuarioservice.buscarPorUsername(entity.get("username"));
        if(usuario.isPresent() && usuario.get().getPassword().equals(entity.get("password"))){
            String token = JWTUtil.generateToken(usuario.get().getUser());
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status(401).body("Credenciais inválidas");        
    }
    
}
