package com.pruebas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodocumentos")
@Data
public class TipoDocumentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipodocuemtnos;

    @Column(name="nombre_tipo_documento")
    private String nombreTipoDocumento;
}
