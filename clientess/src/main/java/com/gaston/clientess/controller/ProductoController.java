package com.gaston.clientess.controller;

import com.gaston.clientess.model.Cliente;
import com.gaston.clientess.model.Producto;
import com.gaston.clientess.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("producto")


public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public List<Producto> buscarTodosLosProducto() {return productoService.mostrarTodos();
    }
    @GetMapping("/{idproducto}")
    public Producto mostrarProductoid(@PathVariable int idproducto){ return productoService.mostrarproductoid(idproducto) ;
    }


    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.crearProducto(producto);

    }

    @PostMapping("/actualizar")
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return productoService.actualizarProducto(producto);

    }








}
