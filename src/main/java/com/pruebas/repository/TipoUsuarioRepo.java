package com.pruebas.repository;

import com.pruebas.model.TipoUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUsuarioRepo extends JpaRepository<TipoUsuarioModel, Integer> {
    // atributo de interface:
}
