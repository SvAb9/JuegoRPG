package co.edu.uniquindio.poo;

import java.util.Collection;


public class Juego {

    private String nombre;
    private Collection<Personaje> personajes;
    

    public Juego(String nombre,Collection<Personaje> personajes){

        this.nombre= nombre;
        this.personajes = personajes;
        

    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Personaje> getPersonajes() {
        return personajes;
    }

}