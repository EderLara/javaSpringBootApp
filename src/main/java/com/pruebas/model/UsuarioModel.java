package com.pruebas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(name="pass_user", nullable = false)
    private String passUser;

    @Column(name="estado_user", nullable = false)
    private Boolean estadoUser;
}
