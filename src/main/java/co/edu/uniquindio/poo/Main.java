package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {
        
        PersonajeMagoBuilder builderMago = new PersonajeMagoBuilder();
        PersonajeArqueroBuilder builderArquero = new PersonajeArqueroBuilder();
        PersonajeGuerreroBuilder builderGuerrero = new PersonajeGuerreroBuilder();

        
        Director director = new Director(builderMago, builderArquero, builderGuerrero);

        
        director.construirMago("Merlín", "Poderoso mago", "El Sabio", 100.0f, 10, 8, 5);
        Personaje mago = director.obtenerMago();
        System.out.println("Mago creado: " + mago.getNombre());

        
        director.construirArquero("Legolas", "Elfo arquero", "El de los ojos de águila", 150.0f, 10, 20, 30);
        Personaje arquero = director.obtenerArquero();
        System.out.println("Arquero creado: " + arquero.getNombre());

        
        director.construirGuerrero("Conan", "Poderoso guerrero bárbaro", "El Destructor", 200.0f, 15, 12, 20);
        Personaje guerrero = director.obtenerGuerrero();
        System.out.println("Guerrero creado: " + guerrero.getNombre());
    }
}
