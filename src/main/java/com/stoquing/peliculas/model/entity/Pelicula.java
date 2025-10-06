package com.stoquing.peliculas.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id_pelicula;

    @Column(name = "nombre", nullable = false, length = 50)
    String nombre;

    @Column(name = "director", nullable = false, length = 50)
    String director;

    @Column(name = "genero", nullable = false, length = 50)
    String genero;

    @Column (name = "duracion", nullable = false, length = 50)
    int duracion;

    @Column (name = "anio",  nullable = false, length = 50)
    int anio;

    @Column (name = "calificacion", nullable = false, length = 50)
    int calificacion;

    public Pelicula(){}


    public Pelicula(int id_pelicula, String nombre, String director, String genero, int duracion, int anio, int calificacion) {
        this.id_pelicula = id_pelicula;
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String imprimirMensaje(){
        return "Nombre: " + this.nombre
                + "\nDirector: " + this.director
                + "\nGenero: " + this.genero
                + "\nDuracion: " + this.duracion
                + "\nAnio: " + this.anio
                + "\nCalificacion: " + this.calcularValoracion();
    }

    public String calcularValoracion(){
        if(this.calificacion >= 0 && this.calificacion <= 2){
            return "Muy mala";
        } else if (this.calificacion > 2 && this.calificacion <= 5){
            return "Mala";
        } else if (this.calificacion > 5 && this.calificacion <= 7){
            return "Regular";
        } else if (this.calificacion > 7 && this.calificacion <= 10){
            return "Muy buena";
        } else {
            return "No es valorable";
        }
    }
}
