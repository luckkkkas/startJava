package com.example.meu_primeiro_spring_boot.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.meu_primeiro_spring_boot.Models.Usuario;

@Repository
public interface UsuarioRepository extends org.springframework.data.jpa.repository.JpaRepository<Usuario, Long> { //classe referenta a tabela, cahve primaria do tipo Long
    
    Optional<Usuario> findByUsername(String username);
}
