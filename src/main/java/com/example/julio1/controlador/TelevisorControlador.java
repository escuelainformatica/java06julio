package com.example.julio1.controlador;

import com.example.julio1.entidad.Televisor;
import com.example.julio1.repo.ITelevisorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/televisor")
public class TelevisorControlador {
    @Autowired
    ITelevisorRepo iTelevisorRepo;
    @PostMapping("/insertar")
    @Transactional
    public Televisor insertar(@RequestBody Televisor televisor) {
        televisor=iTelevisorRepo.save(televisor);
        return televisor;
    }
    @GetMapping("/listar")
    public List<Televisor> listar() {
        // JPA findAll()
        List<Televisor> televisores= (List<Televisor>) iTelevisorRepo.findAll();
        return televisores;
    }
}
