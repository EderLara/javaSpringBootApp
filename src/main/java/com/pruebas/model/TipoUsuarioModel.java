package com.pruebas.model;

import jakarta.persistence.*;
import lombok.Data;

// import java.util.List;

@Data
@Entity
@Table(name = "tipousuario")
public class TipoUsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipousuario;

    @Column(nullable = false, length = 50, unique = true)
    private String nombre_tipousuario;

    @Column(name="estado_tipo_user")
    private Boolean estadoTipoUser;
}
