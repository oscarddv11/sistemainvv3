package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Proveedor;

/**
 * ProveedorService
 */
public interface ProveedorService {

    public List<Proveedor> findAll();
    public Proveedor save(Proveedor entity);
    public Optional<Proveedor> findById(Long id);
    public void delete(Long id);
}