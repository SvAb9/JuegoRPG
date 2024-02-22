package co.edu.uniquindio.poo;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;

    // Constructor con todos los atributos
    public Personaje(String nombre, String descripcion, String apodo, float dineroInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
    }

    // Constructor con nombre, descripción y apodo
    public Personaje(String nombre, String descripcion, String apodo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
    }

    // Constructor con nombre, descripción y dineroInicial
    public Personaje(String nombre, String descripcion, int dineroInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dineroInicial = dineroInicial;
    }

    // Constructor con nombre, apodo y dineroInicial
    public Personaje(String nombre, String apodo, float dineroInicial) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
    }

    // Constructor con nombre y apodo
    public Personaje(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    // Constructor con nombre y dineroInicial
    public Personaje(String nombre, float dineroInicial) {
        this.nombre = nombre;
        this.dineroInicial = dineroInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public float getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

}
