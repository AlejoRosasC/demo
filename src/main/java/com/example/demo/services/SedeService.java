package com.example.demo.services;


import com.example.demo.models.SedeModel;
import com.example.demo.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SedeService {

    @Autowired
    SedeRepository sedeRepository;

    public ArrayList<SedeModel> obtenerSede(){
        return (ArrayList<SedeModel>) sedeRepository.findAll();
    }

    public Optional<SedeModel> obtenerPorId(Long id){
        return sedeRepository.findById(id);
    }

    public SedeModel guardarSede (SedeModel sede){
        return sedeRepository.save(sede);
    }

    public boolean eliminarSede (Long id){
        try{
            sedeRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
