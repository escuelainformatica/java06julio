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
    @PostMapping("/insertar2") // http://localhost:8080/radio/insertar2
    public int insertar2(@RequestBody List<Radio> radios) {
        int resultado=0;
        for (Radio radio:radios) {
            radio=iRadioRepo.save(radio);
            resultado=radio.getId();
        }
        return resultado;
    }

    @GetMapping("/vender/{idradio}/{cantidad}") // http://localhost:8080/radio/vender/10/5
    public boolean vender(@PathVariable int idradio,@PathVariable int cantidad ) {
        boolean resultado=true;
        Radio radioInicial=iRadioRepo.findById(idradio).get();

        int stock=radioInicial.getStock();
        int resta=stock-cantidad;
        if(resta<0) {
            resultado=false;
        } else {
            resultado=true;
            radioInicial.setStock(resta);
            iRadioRepo.save(radioInicial);
        }
        return resultado;
    }

    @GetMapping("/vender2") // http://localhost:8080/radio/vender2?id=8&cantidad=22
    public boolean vender2(int id,int cantidad ) {
        boolean resultado=true;
        Radio radioInicial=iRadioRepo.findById(id).get();

        int stock=radioInicial.getStock();
        int resta=stock-cantidad;
        if(resta<0) {
            resultado=false;
        } else {
            resultado=true;
            radioInicial.setStock(resta);
            iRadioRepo.save(radioInicial);
        }
        return resultado;
    }

    @PostMapping("/vender3") // http://localhost:8080/radio/vender3  [post] id=8&cantidad=22
    public boolean vender3(int id,int cantidad ) {
        boolean resultado=true;
        Radio radioInicial=iRadioRepo.findById(id).get();

        int stock=radioInicial.getStock();
        int resta=stock-cantidad;
        if(resta<0) {
            resultado=false;
        } else {
            resultado=true;
            radioInicial.setStock(resta);
            iRadioRepo.save(radioInicial);
        }
        return resultado;
    }

}
