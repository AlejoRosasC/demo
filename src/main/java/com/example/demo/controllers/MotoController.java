package com.example.demo.controllers;

import com.example.demo.models.MotoModel;
import com.example.demo.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/moto")
public class MotoController {
    @Autowired
    MotoService motoService;

    @GetMapping()
    public ArrayList<MotoModel> obtenerMotos(){
        return motoService.obtenerMotos();
    }

    @GetMapping(path = "/{idMoto}")
    public Optional<MotoModel> obtenerMotoPorId (@PathVariable ("idMoto") Long id){
        return this.motoService.obtenerPorId(id);
    }

    @PostMapping
    public MotoModel guardarMoto (@RequestBody MotoModel moto){
        return motoService.guardarMoto(moto);
    }

    @DeleteMapping(path = "/{idMoto}")
    public String eliminarMotoPorId(@PathVariable ("idMoto") Long id) {
        boolean ok = this.motoService.eliminarMoto(id);
        if(ok){
            return "Se elimino la moto";
        }else{
            return "no se pudo eliminar el registro";
        }
    }
}
