package com.inventario.inventarioapp.models.services;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Cliente;
import com.inventario.inventarioapp.models.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClienteServiceImpl
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    public ClienteRepository repository;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) repository.findAll();
	}

	@Override
	public Cliente save(Cliente entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);		
	}
}