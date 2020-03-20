package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Producto;

/**
 * ProductoService
 */
public interface ProductoService {
    public List<Producto> findAll();
    public Producto save(Producto entity);
    public Optional<Producto> findById(Long id);
    public void delete(Long id);
}