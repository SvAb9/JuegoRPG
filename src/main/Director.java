package co.edu.uniquindio.poo;

public class Director {

    private PersonajeMagoBuilder builderMago;
    private PersonajeArqueroBuilder builderArquero;
    private PersonajeGuerreroBuilder builderGuerrero;
    

    public Director (PersonajeBuilder builder){
        this.builderMago = builderMago;
        this.builderArquero = builderArquero;
        this.builderGuerrero = builderGuerrero;
    }

    public void builderMago(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3){

        builderMago.nombre(nombre);
        builderMago.descripcion(descripcion);
        builderMago.apodo(apodo);
        builderMago.dineroInicial(dineroInicial);
        builderMago.habilidad1(habilidad1);
        builderMago.habilidad2(habilidad2);
        builderMago.habilidad3(habilidad3);
    }

    public void builderArquero(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3){

        builderArquero.nombre(nombre);
        builderArquero.descripcion(descripcion);
        builderArquero.apodo(apodo);
        builderArquero.dineroInicial(dineroInicial);
        builderArquero.habilidad1(habilidad1);
        builderArquero.habilidad2(habilidad2);
        builderArquero.habilidad3(habilidad3);
    }
    public void builderGuerrero(String nombre, String descripcion, String apodo, float dineroInicial, String habilidad1, String habilidad2, String habilidad3){

        builderGuerrero.nombre(nombre);
        builderGuerrero.descripcion(descripcion);
        builderGuerrero.apodo(apodo);
        builderGuerrero.dineroInicial(dineroInicial);
        builderGuerrero.habilidad1(habilidad1);
        builderGuerrero.habilidad2(habilidad2);
        builderGuerrero.habilidad3(habilidad3);
    }
}
