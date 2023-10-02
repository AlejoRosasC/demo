package com.example.demo.controllers;

import com.example.demo.models.ClienteModel;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ArrayList<ClienteModel> obtenerCliente(){
        return clienteService.ObtenerCLiente();
    }

    @GetMapping(path = "/{idCliente}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable ("idCliente") Long id){
        return this.clienteService.obtenerPorId(id);
    }

    @PostMapping
    public ClienteModel guardarCliente (@RequestBody ClienteModel cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{idCliente}")
    public String eliminarPorId (@PathVariable ("idCliente") Long id){
        boolean ok = this.clienteService.eliminarCliente(id);
        if(ok){
            return "Se elimino la sede";
        }else{
            return "no se pudo elimnar el registro";
        }
    }

}
