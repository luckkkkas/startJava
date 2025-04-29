package com.example.meu_primeiro_spring_boot.Services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.Models.Usuario;
import com.example.meu_primeiro_spring_boot.repository.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;
    
    public UsuarioDetailsService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username)         // busca o user no banco de dados 
            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado!"));
            return User.builder() 
                .username(usuario.getUser())
                .password(usuario.getPassword())
                .roles("USER")
                .build();
            //retorna um objeto UserDetails 

    } 
}
