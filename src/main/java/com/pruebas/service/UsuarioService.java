package com.pruebas.service;

import com.pruebas.model.UsuarioModel;
import com.pruebas.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepo usuarioRepo;

    // Crear
    public UsuarioModel crearUsuario(UsuarioModel usuario) {
        return usuarioRepo.save(usuario);
    }

    // Leer (todos)
    public List<UsuarioModel> getAllUsuarios() {
        return usuarioRepo.findAll();
    }

    // Leer por ID
    public Optional<UsuarioModel> getUsuarioPorId(Integer id) {
        return usuarioRepo.findByIdusuario(id);
    }

    // Leer por correo electrónico
    public Optional<UsuarioModel> getUsuarioPorCorreo(String correo) {
        return usuarioRepo.findByEmail(correo);
    }

    // Eliminar
    public void eliminarUsuario(Integer id) {
        usuarioRepo.deleteByIdusuario(id);
    }

    // Verificar si existe por correo
    public boolean existeUsuarioPorCorreo(String correo) {
        return usuarioRepo.existsByEmail(correo);
    }
}
