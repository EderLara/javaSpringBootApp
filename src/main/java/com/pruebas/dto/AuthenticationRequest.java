package com.pruebas.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}

/**
 * Comentarios de la clase AuthenticationRequest.java
 * @Data: Anotación de Lombok que genera automáticamente los métodos getter, setter, equals, hashCode y toString.
 * email: El correo electrónico del usuario que intenta autenticarse.   
 * password: La contraseña del usuario que intenta autenticarse.
 * 
 */