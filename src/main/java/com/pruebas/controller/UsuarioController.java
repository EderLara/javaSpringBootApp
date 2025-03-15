package com.pruebas.controller;

import com.pruebas.model.UsuarioModel;
import com.pruebas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Crear un nuevo usuario
    @PostMapping
    public ResponseEntity<UsuarioModel> crearUsuario(@RequestBody UsuarioModel usuario) {
        UsuarioModel nuevoUsuario = usuarioService.crearUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }

    // Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<UsuarioModel>> obtenerTodosLosUsuarios() {
        List<UsuarioModel> usuarios = usuarioService.getAllUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> obtenerUsuarioPorId(@PathVariable Integer id) {
        Optional<UsuarioModel> usuario = usuarioService.getUsuarioPorId(id);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Obtener un usuario por correo electrónico
    @GetMapping("/buscar/{correo}")
    public ResponseEntity<UsuarioModel> obtenerUsuarioPorCorreo(@PathVariable String correo) {
        Optional<UsuarioModel> usuario = usuarioService.getUsuarioPorCorreo(correo);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id) {
        usuarioService.eliminarUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Verificar si existe un usuario por correo electrónico
    @GetMapping("/{correo}")
    public ResponseEntity<Boolean> existeUsuarioPorCorreo(@PathVariable String correo) {
        boolean existe = usuarioService.existeUsuarioPorCorreo(correo);
        return new ResponseEntity<>(existe, HttpStatus.OK);
    }
}
