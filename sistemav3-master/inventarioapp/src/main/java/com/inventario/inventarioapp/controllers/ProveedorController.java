package com.inventario.inventarioapp.controllers;


import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Proveedor;
import com.inventario.inventarioapp.models.services.ProveedorServiceImpl;

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
@RequestMapping("api/proveedores")
public class ProveedorController {
    
    @Autowired
    private ProveedorServiceImpl proveedorService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Proveedor> getList(){
        List<Proveedor> proveedores = proveedorService.findAll();
        return proveedores;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<Proveedor> getcliente(@PathVariable("id") Long id){
        Optional<Proveedor> producto = proveedorService.findById(id);
        return producto;
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public Proveedor guardar(@RequestBody Proveedor cliente){
        Proveedor cd = proveedorService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/", method = RequestMethod.PUT)
    public Proveedor actualizar(@RequestBody Proveedor cliente){
        Proveedor cd = proveedorService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable("id") Long id){
        proveedorService.delete(id);
    }

}