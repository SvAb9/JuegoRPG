package co.edu.uniquindio.poo;

public class PersonajeMagoBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private int bolaFuego;
    private int rayoElectrico;
    private int hechizoCuracion;
    
    public PersonajeMagoBuilder() {}

    public PersonajeMagoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonajeMagoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public PersonajeMagoBuilder apodo(String apodo) {
        this.apodo = apodo;
        return this;
    }
    
    public PersonajeMagoBuilder dineroInicial(float dineroInicial) {
        this.dineroInicial = dineroInicial;
        return this;
    }

    public PersonajeMagoBuilder habilidad1 (int bolaFuego) {
        this.bolaFuego = bolaFuego;
        return this;
    }

    public PersonajeMagoBuilder habilidad2(int rayoElectrico) {
        this.rayoElectrico = rayoElectrico;
        return this;
    }

    public PersonajeMagoBuilder habilidad3 (int hechizoCuracion) {
        this.hechizoCuracion = hechizoCuracion;
        return this;
    }

    public Personaje build() {
        return new Personaje(nombre, descripcion, apodo, dineroInicial, bolaFuego, rayoElectrico, hechizoCuracion);
    }

}
    