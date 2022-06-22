package com.sistema.blog.service;

import com.sistema.blog.dto.PublicacionDTO;

import java.util.List;

public interface PublicacionService {

    public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);

    public List<PublicacionDTO> obtenerTodasLasPublicaciones();
}
