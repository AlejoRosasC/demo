package com.example.demo.services;

import com.example.demo.models.MotoModel;
import com.example.demo.repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MotoService {

    @Autowired
    MotoRepository motoRepository;

    public ArrayList<MotoModel> obtenerMotos(){
        return (ArrayList<MotoModel>) motoRepository.findAll();
    }

    public Optional<MotoModel> obtenerPorId(Long id){
        return motoRepository.findById(id);
    }

    public MotoModel guardarMoto(MotoModel moto){
        return motoRepository.save(moto);
    }

    public boolean eliminarMoto(Long id){
        try{
            motoRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
}
