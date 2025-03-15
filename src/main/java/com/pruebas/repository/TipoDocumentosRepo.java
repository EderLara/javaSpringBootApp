package com.pruebas.repository;

import com.pruebas.model.TipoDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;   // Importa la clase JpaRepository
import org.springframework.stereotype.Repository;             // Importa la clase Repository

@Repository
public interface TipoDocumentosRepo extends JpaRepository<TipoDocumentos, Integer> { // Se declara la interfaz TipoDocumentosRepo que extiende de JpaRepository<TipoDocumentos, Integer>

}
