package com.pruebas.repository;

import com.pruebas.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolesRepo extends JpaRepository<Roles, Integer> {
    boolean existsByNombre(String nombre);
}
