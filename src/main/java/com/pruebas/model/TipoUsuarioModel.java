package com.pruebas.model;

import jakarta.persistence.*;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
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

    // @OneToMany(mappedBy = "tipousuario", cascade = CascadeType.ALL, orphanRemoval = true)
    // private List<Roles> roles;
}

