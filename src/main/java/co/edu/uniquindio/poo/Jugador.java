package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    List <Personaje> listaPersonajes;
    Director director;

    public Jugador (){
        listaPersonajes = new ArrayList<>();
    }

    public void adicionarMago(String nombre, String descripcion, String apodo, float dineroInicial, int bolaFuego, int rayoElectrico, int hechizoCuracion) throws IllegalArgumentException {
        if (existeNombre(nombre)) {
            throw new IllegalArgumentException("Ya existe un personaje con el nombre " + nombre);
        }
    
        PersonajeMagoBuilder builder = new PersonajeMagoBuilder()
                .nombre(nombre)
                .descripcion(descripcion)
                .apodo(apodo)
                .dineroInicial(dineroInicial)
                .habilidad1(bolaFuego)
                .habilidad2(rayoElectrico)
                .habilidad3(hechizoCuracion);
    
        Personaje nuevoMago = builder.build();
        listaPersonajes.add(nuevoMago);
    }
    
    public void adicionarArquero(String nombre, String descripcion, String apodo, float dineroInicial, int disparoRapido, int flechaVenenosa, int tiroCertero) throws IllegalArgumentException {
        if (existeNombre(nombre)) {
            throw new IllegalArgumentException("Ya existe un personaje con el nombre " + nombre);
        }
    
        PersonajeArqueroBuilder builder = new PersonajeArqueroBuilder()
                .nombre(nombre)
                .descripcion(descripcion)
                .apodo(apodo)
                .dineroInicial(dineroInicial)
                .habilidad1(disparoRapido)
                .habilidad2(flechaVenenosa)
                .habilidad3(tiroCertero);
    
        Personaje nuevoArquero = builder.build();
        listaPersonajes.add(nuevoArquero);
    }
    public void adicionarGuerrero(String nombre, String descripcion, String apodo, float dineroInicial, int espadaAfilada, int golpeDefinitivo, int escudoProtector) throws IllegalArgumentException {
        if (existeNombre(nombre)) {
            throw new IllegalArgumentException("Ya existe un personaje con el nombre " + nombre);
        }
    
        PersonajeGuerreroBuilder builder = new PersonajeGuerreroBuilder()
                .nombre(nombre)
                .descripcion(descripcion)
                .apodo(apodo)
                .dineroInicial(dineroInicial)
                .habilidad1(espadaAfilada)
                .habilidad2(golpeDefinitivo)
                .habilidad3(escudoProtector);
    
        Personaje nuevoGuerrero = builder.build();
        listaPersonajes.add(nuevoGuerrero);
    }

    private boolean existeNombre(String nombre) {
        for (Personaje personaje : listaPersonajes) {
            if (personaje.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
