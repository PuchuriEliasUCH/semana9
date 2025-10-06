package com.stoquing.peliculas.model.service;

import com.stoquing.peliculas.model.entity.Pelicula;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    public List<Pelicula> listar();
    public void guardar(Pelicula pelicula);
    public Optional<Pelicula> buscar(int id);
    public void eliminar(int id);

}
