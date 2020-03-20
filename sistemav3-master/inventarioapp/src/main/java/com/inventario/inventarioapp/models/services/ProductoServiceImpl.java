package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Producto;
import com.inventario.inventarioapp.models.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductoServiceImpl
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    public ProductoRepository repository;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) repository.findAll();
	}

	@Override
	public Producto save(Producto entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);		
	}
    
}