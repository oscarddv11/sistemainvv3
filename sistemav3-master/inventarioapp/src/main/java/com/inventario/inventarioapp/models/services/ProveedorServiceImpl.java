package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Proveedor;
import com.inventario.inventarioapp.models.repository.ProveedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProveedorImpl
 */
@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    public ProveedorRepository repository;

	@Override
	public List<Proveedor> findAll() {
		return (List<Proveedor>) repository.findAll();
	}

	@Override
	public Proveedor save(Proveedor entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Proveedor> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);		
	}
    
}