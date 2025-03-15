package com.pruebas.service;

import com.pruebas.model.Roles;
import com.pruebas.repository.RolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesService {

    @Autowired
    private RolesRepo rolesRepo;

    public Roles crearRol(Roles rol) {
        return rolesRepo.save(rol);
    }

    public Roles getRolPorId(Integer id) {
        return rolesRepo.findById(id).orElse(null);
    }

    public void eliminarRol(Integer id) {
        rolesRepo.deleteById(id);
    }

    public boolean existeRolPorNombre(String nombre) {
        return rolesRepo.existsByNombre(nombre);
    }

}
