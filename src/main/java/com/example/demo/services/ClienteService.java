package com.example.demo.services;

import com.example.demo.models.ClienteModel;
import com.example.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> ObtenerCLiente() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public Optional<ClienteModel> obtenerPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public ClienteModel guardarCliente (ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente (Long id){
        try{
            clienteRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
