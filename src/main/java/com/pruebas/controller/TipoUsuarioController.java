package com.pruebas.controller;

import com.pruebas.model.TipoUsuarioModel;
import com.pruebas.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/tipousuario")
public class TipoUsuarioController {
    @Autowired
    private TipoUserService tipoUserService;
    
    // Métodos del CRUD:
    // Método para ver todos los tipos de usuario:
    @GetMapping("/api/v1/tipousuario")
    public List<TipoUsuarioModel> getAll() {
        return tipoUserService.listAll();
    }

    // Método para crear un tipo de usuario:
    @PostMapping("/api/v1/tipousuario/nuevo")
    public TipoUsuarioModel createTipoUsuario(@RequestBody TipoUsuarioModel tipousermodel) {        
        return tipoUserService.saveTipoUser(tipousermodel);
    }
}
