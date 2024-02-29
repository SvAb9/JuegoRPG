package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    List <Personaje> listaPersonajes;
    Director director;

    public Jugador (){
        listaPersonajes = new ArrayList<>();
    }

    public void adicionarMago(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3) {
        Personaje mago = director.builderMago(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3);
        listaPersonajes.add(mago);
    }

    public void adicionarArquero(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3) {
        Personaje arquero = director.builderArquero(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3);
        listaPersonajes.add(arquero);
    }

    public void adicionarGuerrero(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3) {
        Personaje guerrero = director.builderGuerrero(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3);
        listaPersonajes.add(guerrero);
    }
}
