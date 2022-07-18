package com.gaston.clientess.service.producto;


import com.gaston.clientess.model.Producto;
import com.gaston.clientess.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
ProductoRepository productoRepository;

    @Override
    public List<Producto> mostrarTodos() {

        return productoRepository.findAll();
    }

    @Override
    public Producto mostrarproductoid(int idproducto) {
        return productoRepository.findById(idproducto).orElse(null);

    }

    @Override
    public Producto crearProducto(Producto producto) {
        int idnuevo = productoRepository.findAll().size()+1;
        producto.setIdproducto(idnuevo);
        productoRepository.save(producto);

        return producto;
        
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        if (producto.getIdproducto()>0 && producto.getIdproducto()<=productoRepository.findAll().size()) {
            return productoRepository.save(producto);
            
        }
        return null;
       
    }
}
