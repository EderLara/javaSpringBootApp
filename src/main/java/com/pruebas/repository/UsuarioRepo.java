package com.pruebas.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pruebas.model.UsuarioModel;

public interface UsuarioRepo extends JpaRepository<UsuarioModel, Integer> {
    /**
     * Busca un usuario por su dirección de correo electrónico.
     *
     * @param email La dirección de correo electrónico del usuario.
     * @return Un Optional que contiene el usuario si se encuentra, o un Optional vacío si no.
     */
    Optional<UsuarioModel> findByEmail(String email);

    /**
     * Verifica si existe un usuario con la dirección de correo electrónico dada.
     *
     * @param email La dirección de correo electrónico a verificar.
     * @return true si existe un usuario con la dirección de correo electrónico, false en caso contrario.
     */
    boolean existsByEmail(String email);

    /**
     * Busca un usuario por su id de usuario.
     *
     * @param idusuario El id del usuario.
     * @return Un Optional que contiene el usuario si se encuentra, o un Optional vacío si no.
     */
    Optional<UsuarioModel> findByIdusuario(Integer idusuario);

    /**
     * Elimina un usuario por su id de usuario.
     *
     * @param idusuario El id del usuario.
     */
    void deleteByIdusuario(Integer idusuario);
}






