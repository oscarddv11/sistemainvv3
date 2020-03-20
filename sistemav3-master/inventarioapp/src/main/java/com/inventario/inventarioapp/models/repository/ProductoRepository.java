package com.inventario.inventarioapp.models.repository;

import com.inventario.inventarioapp.models.entities.Producto;

import org.springframework.data.repository.CrudRepository;

/**
 * ProductoRepository
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
