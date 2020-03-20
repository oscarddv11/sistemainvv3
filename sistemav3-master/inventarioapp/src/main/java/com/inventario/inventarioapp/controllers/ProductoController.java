package com.inventario.inventarioapp.controllers;

import java.util.List;
import java.util.Optional;

import com.inventario.inventarioapp.models.entities.Producto;
import com.inventario.inventarioapp.models.services.ProductoServiceImpl;

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
@RequestMapping("api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoServiceImpl productoService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Producto> getList(){
        List<Producto> productos = productoService.findAll();
        return productos;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<Producto> getcliente(@PathVariable("id") Long id){
        Optional<Producto> producto = productoService.findById(id);
        return producto;
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public Producto guardar(@RequestBody Producto cliente){
        Producto cd = productoService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/", method = RequestMethod.PUT)
    public Producto actualizar(@RequestBody Producto cliente){
        Producto cd = productoService.save(cliente);
        return cd;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable("id") Long id){
        productoService.delete(id);
    }

}