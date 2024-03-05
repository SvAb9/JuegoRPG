package co.edu.uniquindio.poo;

public class Director {

    private PersonajeMagoBuilder builderMago;
    private PersonajeArqueroBuilder builderArquero;
    private PersonajeGuerreroBuilder builderGuerrero;

    public Director(PersonajeMagoBuilder builderMago, PersonajeArqueroBuilder builderArquero, PersonajeGuerreroBuilder builderGuerrero) {
        this.builderMago = builderMago;
        this.builderArquero = builderArquero;
        this.builderGuerrero = builderGuerrero;
    }

    public void construirMago(String nombre, String descripcion, String apodo, float dineroInicial, int bolaFuego, int rayoElectrico, int hechizoCuracion) {
        builderMago.nombre(nombre)
                   .descripcion(descripcion)
                   .apodo(apodo)
                   .dineroInicial(dineroInicial)
                   .habilidad1(bolaFuego)
                   .habilidad2(rayoElectrico)
                   .habilidad3(hechizoCuracion);
    }

    public void construirArquero(String nombre, String descripcion, String apodo, float dineroInicial, int disparoRapido, int flechaVenenosa, int tiroCertero) {
        builderArquero.nombre(nombre)
                      .descripcion(descripcion)
                      .apodo(apodo)
                      .dineroInicial(dineroInicial)
                      .habilidad1(disparoRapido)
                      .habilidad2(flechaVenenosa)
                      .habilidad3(tiroCertero);
    }

    public void construirGuerrero(String nombre, String descripcion, String apodo, float dineroInicial, int espadaAfilada, int golpeDefinitivo, int escudoProtector) {
        builderGuerrero.nombre(nombre)
                        .descripcion(descripcion)
                        .apodo(apodo)
                        .dineroInicial(dineroInicial)
                        .habilidad1(espadaAfilada)
                        .habilidad2(golpeDefinitivo)
                        .habilidad3(escudoProtector);
    }

    public Personaje obtenerMago() {
        return builderMago.build();
    }

    public Personaje obtenerArquero() {
        return builderArquero.build();
    }

    public Personaje obtenerGuerrero() {
        return builderGuerrero.build();
    }
}
