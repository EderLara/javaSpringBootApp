package com.pruebas.repository;

import com.pruebas.model.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatosPersonalesRepo extends JpaRepository<DatosPersonales, Integer> {

}
