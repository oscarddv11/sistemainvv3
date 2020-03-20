package com.inventario.inventarioapp.models.repository;

import com.inventario.inventarioapp.models.entities.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * ClienteRepository
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
