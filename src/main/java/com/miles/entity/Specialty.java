package com.miles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // <-- Le ponemos la Anotacion para indicar que es una entidad.
// (Osea esta anotacion crea una tabla en la base de datos con los atributos de la clase)

public class Specialty {

    @Id // <-- Le ponemos la Anotacion para indicar que es un ID. (El id de la tabla en la base de datos
    private long id;
    @Column(nullable = false, unique = true) // <-- Le ponemos la anotacion que es para indicar en la db que este campo
    // no puede ser nulo y que es unico.
    private String name;
    private String urlImage;


    // Empty constructor
    public Specialty() {
    }

    public Specialty(long id, String name, String urlImage) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
    }

    // Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
