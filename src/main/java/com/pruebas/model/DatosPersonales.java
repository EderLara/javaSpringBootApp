package com.pruebas.model;


import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "datospersonales")
@Data
public class DatosPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddatospersonales;

    @Column(name="nombre_completo")
    private String nombreCompleto;

    @Column(name="cedula", nullable = false)
    private String cedula;

    @Column(name="direccion", nullable = false)
    private String direccion;

    @Column(name="telefono", nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuarioModel usuario;
    @ManyToOne
    @JoinColumn(name = "idtipodocuemtnos")
    private TipoDocumentos tipoDocumentos;
}
