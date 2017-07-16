package com.example.Restaurante.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by alumno on 12/07/2017.
 */
@Entity
public class Comensal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Nombre;
    private int Apellidos;
    private int Cantidad;

}
