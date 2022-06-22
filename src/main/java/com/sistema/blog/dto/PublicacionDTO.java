package com.sistema.blog.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicacionDTO {

    private  Long id;
    private  String titulo;
    private  String descripcion;
    private  String contenido;

    public PublicacionDTO() {
        super();
    }
}
