package com.gaston.clientess.service.cliente;

import com.gaston.clientess.dto.Clientedto;
import com.gaston.clientess.model.Cliente;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClienteService {

    Cliente buscarPorDni(Integer dni);

    List<Cliente> mostrarTodos();

    Clientedto mostrarClienteDNI(Integer dni);

    List<Clientedto>mostrarListaEdad();

    Cliente crearcliente(@RequestBody Cliente cliente);


    Cliente actualizarcliente(Cliente cliente);
}
