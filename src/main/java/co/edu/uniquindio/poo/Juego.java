package co.edu.uniquindio.poo;

import java.util.Collection;


public class Juego {

    private String nombre;
    private Collection<Personaje> personajes;
    private ValidarPersonaje validarPersonaje;

    public Juego(String nombre,Collection<Personaje> personajes, ValidarPersonaje validarPersonaje){

        this.nombre= nombre;
        this.personajes = personajes;
        this.validarPersonaje = validarPersonaje;

    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Personaje> getPersonajes() {
        return personajes;
    }

    public void registarPersonaje(Personaje nuevoPersonaje) {
        if (validarPersonaje.esNombreEnUso(nuevoPersonaje.getNombre())) {
            throw new IllegalArgumentException("El nombre del personaje ya está en uso");
        }
        personajes.add(nuevoPersonaje);
    }

}