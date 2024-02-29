package co.edu.uniquindio.poo;

public class PersonajeGuerreroBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private String habilidad1;
    private String habilidad2;
    private String habilidad3;
    
    private PersonajeGuerreroBuilder() {}

    public PersonajeGuerreroBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonajeGuerreroBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public PersonajeGuerreroBuilder apodo(String apodo) {
        this.apodo = apodo;
        return this;
    }
    
    public PersonajeGuerreroBuilder dineroInicial(float dineroInicial) {
        this.dineroInicial = dineroInicial;
        return this;
    }

    public PersonajeGuerreroBuilder habilidad1(String habilidad1) {
        this.habilidad1 = habilidad1;
        return this;
    }

    public PersonajeGuerreroBuilder habilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
        return this;
    }

    public PersonajeGuerreroBuilder habilidad3(String habilidad3) {
        this.habilidad3 = habilidad3;
        return this;
    }

    public Personaje build() {
        return new Personaje(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3);
    }
}
