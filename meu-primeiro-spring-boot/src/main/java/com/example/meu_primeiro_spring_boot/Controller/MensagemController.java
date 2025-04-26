package com.example.meu_primeiro_spring_boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_spring_boot.Services.MensagemService;

@RestController
@RequestMapping("/apis")
public class MensagemController {
    final private MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return mensagemService.obterMessage();
    }
}
