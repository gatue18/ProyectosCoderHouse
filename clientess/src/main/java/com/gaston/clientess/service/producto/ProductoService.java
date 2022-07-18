package com.gaston.clientess.service.producto;


import com.gaston.clientess.model.Producto;

import java.util.List;

public interface ProductoService {


    List<Producto> mostrarTodos();

    Producto mostrarproductoid(int idproducto);

    Producto crearProducto(Producto producto);

    Producto actualizarProducto(Producto producto);
}
