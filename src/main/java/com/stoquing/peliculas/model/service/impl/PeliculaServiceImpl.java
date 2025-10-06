package com.stoquing.peliculas.model.service.impl;


import com.stoquing.peliculas.model.entity.Pelicula;
import com.stoquing.peliculas.model.repository.PeliculaRepository;
import com.stoquing.peliculas.model.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaRepository repositorio;

    @Override
    public List<Pelicula> listar() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Pelicula pelicula) {
        repositorio.save(pelicula);
    }

    @Override
    public Optional<Pelicula> buscar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}



