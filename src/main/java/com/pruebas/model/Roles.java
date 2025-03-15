package com.pruebas.model;

import java.time.LocalDateTime;

// ROLES.java
import jakarta.persistence.*;


import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idroles;
    private LocalDateTime creado;
    private LocalDateTime modificado;

    @ManyToOne
    @JoinColumn(name = "idtipousuario", nullable = false)
    private TipoUsuarioModel tipoUsuario;
    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private UsuarioModel usuario;
}