package com.inventario.inventarioapp.models.entities;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Producto
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	/**
	 *
	 */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="codigo")
    @NotEmpty
    private String codigo;

    @Column(name="nombre")
    @NotEmpty
    private String nombre;

    @Column(name="descripcion")
    @NotEmpty
    private String desccripcion;

    @Column(name="cantidad")
    @NotEmpty
    private Long cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_id", nullable=false)
    private Proveedor cliente;

}
