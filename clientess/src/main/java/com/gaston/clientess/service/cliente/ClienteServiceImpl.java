package com.gaston.clientess.service.cliente;

import com.gaston.clientess.dto.Clientedto;
import com.gaston.clientess.model.Cliente;
import com.gaston.clientess.repository.ClienteRepository;
import com.gaston.clientess.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    Cliente cliente;
    int edad;
    List<Cliente> copialista;
    List<Clientedto> listaamostrar = new ArrayList<>();


    @Override
    public Cliente buscarPorDni(Integer dni) {

        return clienteRepository.findById(dni).orElse(null);

    }



    @Override
    public List<Cliente> mostrarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Clientedto mostrarClienteDNI(Integer dni) {
        cliente= clienteRepository.findById(dni).orElse(null);
        if(cliente!=null) {
            edad = cacularedad(cliente);
            Clientedto clienteamostrar = new Clientedto(cliente.getIdcliente(), cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            return clienteamostrar;
        }
        return null;
    }

    @Override
    public List<Clientedto> mostrarListaEdad() {
        copialista=clienteRepository.findAll();
        int finalLista = copialista.size();
        for(int i=0;i<finalLista;i++){
            cliente=copialista.get(i);
            edad=cacularedad(cliente);
            Clientedto clienteamostrar = new Clientedto(cliente.getIdcliente(), cliente.getDni(),cliente.getNombre(),cliente.getApellido(), edad);
            listaamostrar.add(clienteamostrar);
        }
        return listaamostrar;
    }

    @Override
    public Cliente crearcliente(Cliente cliente) {
       int idnuevo = clienteRepository.findAll().size()+1;
       cliente.setIdcliente(idnuevo);
       clienteRepository.save(cliente);

        return cliente;
    }

    @Override
    public Cliente actualizarcliente(Cliente cliente) {
        if (cliente.getIdcliente()>0 && cliente.getIdcliente()<=clienteRepository.findAll().size()) {
            return clienteRepository.save(cliente);
        }
        return null;

    }

    private int cacularedad(Cliente cliente) {
        Date fecha= cliente.getFechaNacimiento();
        String fechaString = fecha.toString();
        int anio = Integer.parseInt(fechaString.substring(0,4));
        int mes = Integer.parseInt(fechaString.substring(5,7));
        int dia = Integer.parseInt(fechaString.substring(8,10));
        int edad = Period.between(LocalDate.of(anio,mes,dia),LocalDate.now()).getYears();
        return edad;
    }



}
