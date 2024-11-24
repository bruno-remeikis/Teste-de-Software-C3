package com.faesa.cucumber.repository;

import com.faesa.cucumber.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}