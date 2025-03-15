package com.pruebas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String jwt;
}


/**
 *  Comentarios de la clase AuthenticationResponse.java
 *  @Data: Anotación de Lombok que genera automáticamente los métodos getter, setter, equals, hashCode y toString.
    @AllArgsConstructor: Anotación de Lombok que genera automáticamente un constructor con todos los argumentos.
    jwt: El token JWT generado después de la autenticación exitosa.
 *
 *  @Data: Genera automáticamente los métodos getter, setter, equals, hashCode y toString.
    @AllArgsConstructor: Genera automáticamente un constructor con todos los argumentos.
    jwt: El token JWT generado después de la autenticación exitosa.
 */