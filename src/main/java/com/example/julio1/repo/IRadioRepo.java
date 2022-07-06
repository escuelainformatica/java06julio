package com.example.julio1.repo;

import com.example.julio1.entidad.Radio;
import org.springframework.data.repository.CrudRepository;

//  Crud = Create, Read, Update, Delete

public interface IRadioRepo extends CrudRepository<Radio,Integer> {
}
