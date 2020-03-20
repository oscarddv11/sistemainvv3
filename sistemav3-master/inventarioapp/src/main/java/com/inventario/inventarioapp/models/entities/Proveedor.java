package com.inventario.inventarioapp.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Proveedor
 */
@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    @NotEmpty
    private String nombre;

    @Column(name="descripcion")
    @NotEmpty
    private String descripcion;

    @Column(name="telefono")
    @NotEmpty
    private String telefono;

    @Column(name="direccion")
    @NotEmpty
    private String direccion;

    @Column(name="email")
    @NotEmpty
    private String email;
    
}