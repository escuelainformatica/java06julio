package com.example.julio1.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Televisor {
    @Id
    private String modelo;
    private String marca;
    private int pulgadas;
    private boolean smartTv;
}
