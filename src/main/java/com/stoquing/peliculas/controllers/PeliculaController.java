package com.stoquing.peliculas.controllers;

import com.stoquing.peliculas.model.entity.Pelicula;
import com.stoquing.peliculas.model.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PeliculaController {

    @Autowired
    private PeliculaService servicio;

    @GetMapping("/")
    public String listar (Model model){
        List<Pelicula> peliculas = servicio.listar();
        model.addAttribute("peliculas", peliculas);
        return "index";
    }



    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("peliculas", new Pelicula());
        return "registro";
    }

    @PostMapping("/guardar")
    public String guardar ( @ModelAttribute Pelicula pelicula){
        servicio.guardar(pelicula);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model modelo) {
        Pelicula pelicula = servicio.buscar(id).orElse(null);
        modelo.addAttribute("peliculas", pelicula);
        return "registro";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable int id) {
        servicio.eliminar(id);
        return "redirect:/";
    }
}
