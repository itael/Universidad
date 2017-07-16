package com.umg.curso.clases;

/**
 * Created by ita on 28/06/2017.
 */
public class Deportista {
    private String Nombre;
    private int Edad;


    public Deportista(){
        Nombre = null;
        Edad = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
