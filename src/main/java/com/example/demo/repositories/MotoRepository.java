package com.example.demo.repositories;

import com.example.demo.models.MotoModel;
import org.springframework.data.repository.CrudRepository;

public interface MotoRepository extends CrudRepository <MotoModel, Long> {

}
