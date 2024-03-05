package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {
        // Crear los builders para cada tipo de personaje
        PersonajeMagoBuilder builderMago = new PersonajeMagoBuilder();
        PersonajeArqueroBuilder builderArquero = new PersonajeArqueroBuilder();
        PersonajeGuerreroBuilder builderGuerrero = new PersonajeGuerreroBuilder();

        // Crear el director
        Director director = new Director(builderMago, builderArquero, builderGuerrero);

        // Construir un mago
        director.construirMago("Merlín", "Poderoso mago", "El Sabio", 100.0f, 10, 8, 5);
        Mago mago = director.obtenerMago();
        System.out.println("Mago creado: " + mago.getNombre());

        // Construir un arquero
        director.construirArquero("Legolas", "Elfo arquero", "El de los ojos de águila", 150.0f, "Disparo Rápido", "Flecha Venenosa", "Tiro Certero");
        Arquero arquero = director.obtenerArquero();
        System.out.println("Arquero creado: " + arquero.getNombre());

        // Construir un guerrero
        director.construirGuerrero("Conan", "Poderoso guerrero bárbaro", "El Destructor", 200.0f, 15, 12, 20);
        Guerrero guerrero = director.obtenerGuerrero();
        System.out.println("Guerrero creado: " + guerrero.getNombre());
    }
}
