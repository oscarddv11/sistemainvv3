package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Cliente;

/**
 * ClienteService
 */
public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente save(Cliente entity);
    public Optional<Cliente> findById(Long id);
    public void delete(Long id);

}