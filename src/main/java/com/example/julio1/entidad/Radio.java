package com.example.julio1.entidad;

//   JPA Java Persistence API.
import javax.persistence.*;

@Entity
@Table(name = "radios")
public class Radio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    private String Modelo;
    private double precio;

    private int stock;

    public Radio() {
    }


    public Radio(int id, String modelo, double precio, int stock) {
        this.id = id;
        Modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
