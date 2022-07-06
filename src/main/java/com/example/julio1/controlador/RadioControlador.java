package com.example.julio1.controlador;

import com.example.julio1.entidad.Radio;
import com.example.julio1.repo.IRadioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/radio")
public class RadioControlador {

    @Autowired
    IRadioRepo iRadioRepo;

    @PostMapping("/listar") // http://localhost:8080/radio/listar
    public Iterable<Radio> listarTodo() {
        Iterable<Radio> resultado= iRadioRepo.findAll();
        return resultado;
    }
    @PostMapping("/insertar") // http://localhost:8080/radio/insertar
    public int insertar(@RequestBody Radio radio) {
        int resultado=0;
        radio=iRadioRepo.save(radio);
        resultado=radio.getId();
        return resultado;
    }

}
