package co.edu.uniquindio.poo;

import java.util.Collection;

public class ValidarPersonaje {
    private Collection<Personaje> personajes;

    public ValidarPersonaje(Collection<Personaje> personajes) {
        this.personajes = personajes;
    }

    public boolean esNombreEnUso(String nombre) {
        return personajes.stream().anyMatch(personaje -> personaje.getNombre().equals(nombre));
    }
}