package com.miles.dto;

// DTO (Data Transfer Object) es un patrón de diseño que se utiliza para transferir datos entre subsistemas de un software.
//Utilizado para transferir datos entre diferentes capas de la aplicación. No contiene lógica de negocio.
public class SpecialtyDTO {

    // Traemos los atributos de la clase Specialty.
    private long id;
    private String name;
    private String urlImage;

    public SpecialtyDTO() {
    }

    public SpecialtyDTO(long id, String name, String urlImage) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

}
