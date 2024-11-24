package com.faesa.cucumber.service;

import com.faesa.cucumber.repository.UsuarioRepository;
import com.faesa.cucumber.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario inserir(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
}