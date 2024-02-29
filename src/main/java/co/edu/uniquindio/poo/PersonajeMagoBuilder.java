package co.edu.uniquindio.poo;

public class PersonajeMagoBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private String habilidad1;
    private String habilidad2;
    private String habilidad3;
    
    private PersonajeMagoBuilder() {}

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

    public PersonajeMagoBuilder habilidad1(String habilidad1) {
        this.habilidad1 = habilidad1;
        return this;
    }

    public PersonajeMagoBuilder habilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
        return this;
    }

    public PersonajeMagoBuilder habilidad3(String habilidad3) {
        this.habilidad3 = habilidad3;
        return this;
    }

    public Mago build() {
        return new Mago(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3);
    }
}

