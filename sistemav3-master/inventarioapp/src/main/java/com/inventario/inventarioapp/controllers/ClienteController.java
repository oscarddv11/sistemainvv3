package com.inventario.inventarioapp.controllers;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Cliente;
import com.inventario.inventarioapp.models.services.ClienteServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClienteController
 */
@RestController
@RequestMapping("api/clientes")
public class ClienteController {
   
    @Autowired
    private ClienteServiceImpl clienteService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Cliente> getList(){
        List<Cliente> clientes = clienteService.findAll();
        return clientes;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<Cliente> getcliente(@PathVariable("id") Long id){
        Optional<Cliente> clientes = clienteService.findById(id);
        return clientes;
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public Cliente guardar(@RequestBody Cliente cliente){
        Cliente cd = clienteService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/", method = RequestMethod.PUT)
    public Cliente actualizar(@RequestBody Cliente cliente){
        Cliente cd = clienteService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable("id") Long id){
        clienteService.delete(id);
    }

}
