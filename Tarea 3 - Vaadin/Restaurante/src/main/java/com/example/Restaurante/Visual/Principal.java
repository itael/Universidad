package com.example.Restaurante.Visual;

import com.example.Restaurante.domain.Restaurante;
import com.example.Restaurante.domain.RestauranteRepository;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alumno on 12/07/2017.
 */

@SpringUI
public class Principal extends UI{
    @Autowired
    RestauranteRepository repository;


    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout VLayaut = new VerticalLayout();
        VLayaut.addComponent(new Button("Hola"));

        Grid<Restaurante> grid=new Grid<>();
        grid.addColumn(Restaurante::getId).setCaption("Id");
        grid.addColumn(Restaurante::getNombre).setCaption("Nombre");
        grid.addColumn(Restaurante::getDirección).setCaption("Categoria");
        grid.addColumn(Restaurante::getDirección).setCaption("Dirección");
        grid.addColumn(Restaurante::getDirección).setCaption("Dirección");

        setContent(VLayaut);
    }

}
