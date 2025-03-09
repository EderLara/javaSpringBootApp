package com.pruebas.service;

import com.pruebas.model.TipoUsuarioModel;
import com.pruebas.repository.TipoUsuarioRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUserService {
    @Autowired
    private TipoUsuarioRepo tipoUsuarioRepo;

    // Métodos del CRUD
    public TipoUsuarioModel saveTipoUser(TipoUsuarioModel tipoUsuarioModel){
        return tipoUsuarioRepo.save(tipoUsuarioModel);
    }

    //  Metodo para ver todos los tipos de usuario:
    public List<TipoUsuarioModel> listAll(){
        return tipoUsuarioRepo.findAll();
    }

    // Metodo para buscar un tipo de usuario por id:    
    public TipoUsuarioModel getTipoUser(Integer id){
        return tipoUsuarioRepo.findById(id).orElse(null);
    }

    // Metodo para eliminar un tipo de usuario:
    public void deleteTipoUser(Integer id){
        tipoUsuarioRepo.deleteById(id);
    }
}
