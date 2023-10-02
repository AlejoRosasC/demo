package com.example.demo.controllers;

import com.example.demo.models.SedeModel;
import com.example.demo.services.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/sede")
public class SedeController {

    @Autowired
    SedeService sedeService;

    @GetMapping
    public ArrayList<SedeModel> obtenerSede(){
        return sedeService.obtenerSede();
    }

    @GetMapping(path = "/{idSede}")
    public Optional<SedeModel> obtenerSedePorId (@PathVariable ("idSede") Long id){
        return this.sedeService.obtenerPorId(id);
    }

    @PostMapping
    public SedeModel guardarSede (@RequestBody SedeModel sede){
        return sedeService.guardarSede(sede);
    }

    @DeleteMapping(path = "/{idSede}")
    public String eliminarMotoPorId(@PathVariable ("idSede") Long id){
        boolean ok = this.sedeService.eliminarSede(id);
        if(ok){
            return "Se elimino la sede";
        }else{
            return "no se pudo elimnar el registro";
        }
    }
}
