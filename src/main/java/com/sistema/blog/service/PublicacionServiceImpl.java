package com.sistema.blog.service;


import com.sistema.blog.dto.PublicacionDTO;
import com.sistema.blog.entity.Publicacion;
import com.sistema.blog.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionServiceImpl implements PublicacionService{


    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO) {
        //Convertimos de DTO a entidad
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(publicacionDTO.getTitulo());
        publicacion.setDescripcion(publicacionDTO.getDescripcion());
        publicacion.setContenido(publicacionDTO.getContenido());

        Publicacion nuevaPublicacion = publicacionRepository.save(publicacion);
        //Convertimos de entidad a DTO
        PublicacionDTO publicacionRespuesta = new PublicacionDTO();
        publicacionRespuesta.setId(nuevaPublicacion.getId());
        publicacionRespuesta.setTitulo(publicacion.getTitulo());
        publicacionRespuesta.setDescripcion(publicacion.getDescripcion());
        publicacionRespuesta.setContenido(publicacion.getContenido());

        return publicacionRespuesta;
    }

    @Override
    public List<PublicacionDTO> obtenerTodasLasPublicaciones() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();

        //return publicaciones.stream().map(publicacion -> );
        return  null;
    }

    //Convierte entidad en DTO
    private PublicacionDTO mapearDTO(Publicacion publicacion){
        PublicacionDTO publicacionDTO = new PublicacionDTO();

        publicacionDTO.setId(publicacion.getId());
        publicacionDTO.setTitulo(publicacion.getTitulo());
        publicacionDTO.setDescripcion(publicacion.getDescripcion());
        publicacionDTO.setContenido(publicacion.getContenido());

        return  publicacionDTO;
    }

    //Convierte DTO en ENTIDAD
    private Publicacion mapearEntidad(PublicacionDTO publicacionDTO){
        Publicacion publicacion = new Publicacion();

        publicacion.setTitulo(publicacionDTO.getTitulo());
        publicacion.setDescripcion(publicacionDTO.getDescripcion());
        publicacion.setContenido(publicacionDTO.getContenido());

        return  publicacion;
    }
}
