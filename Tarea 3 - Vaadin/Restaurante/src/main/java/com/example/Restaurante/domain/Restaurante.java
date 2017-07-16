package com.example.Restaurante.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by alumno on 12/07/2017.
 */
@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String Nombre;
    private int Categoria;
    private String Dirección;
    private int CantTrabajadores;
    private int CantComenzales;
    private List<Comensal> Comensales;
    private boolean Niños;


    public Restaurante() {
    }

    public Restaurante(String nombre, int categoria, String dirección, int cantTrabajadores, int cantComenzales, boolean niños) {
        Nombre = nombre;
        Categoria = categoria;
        Dirección = dirección;
        CantTrabajadores = cantTrabajadores;
        CantComenzales = cantComenzales;
        Niños = niños;
        Comensales = new List<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

    public int getCantTrabajadores() {
        return CantTrabajadores;
    }

    public void setCantTrabajadores(int cantTrabajadores) {
        CantTrabajadores = cantTrabajadores;
    }

    public int getCantComenzales() {
        return CantComenzales;
    }

    public void setCantComenzales(int cantComenzales) {
        CantComenzales = cantComenzales;
    }

    public boolean isNiños() {
        return Niños;
    }

    public void setNiños(boolean niños) {
        Niños = niños;
    }
}
