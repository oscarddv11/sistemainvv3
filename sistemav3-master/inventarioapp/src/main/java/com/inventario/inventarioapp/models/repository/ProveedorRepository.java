package com.inventario.inventarioapp.models.repository;

import com.inventario.inventarioapp.models.entities.Proveedor;

import org.springframework.data.repository.CrudRepository;

/**
 * ProveedorRepository
 */
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {
}
