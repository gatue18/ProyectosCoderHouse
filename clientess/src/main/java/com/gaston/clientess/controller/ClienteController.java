package com.gaston.clientess.controller;

import com.gaston.clientess.dto.Clientedto;
import com.gaston.clientess.model.Cliente;
import com.gaston.clientess.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("gaston/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> buscarTodosLosClientes() {return clienteService.mostrarTodos();
    }
    @GetMapping("/{dni}")
    public Clientedto mostrarDNI(@PathVariable int dni){
        return clienteService.mostrarClienteDNI(dni) ;
    }

    @GetMapping("/all")
    public List<Clientedto>mostrarTablaEdad(){
        return clienteService.mostrarListaEdad();
    }



    @PostMapping("/crear")
public Cliente crearcliente(@RequestBody Cliente cliente){
        return clienteService.crearcliente(cliente);

    }

    @PostMapping("/actualizar")
    public Cliente actualizarcliente(@RequestBody Cliente cliente) {
        return clienteService.actualizarcliente(cliente);

    }
}

