package co.edu.uniquindio.poo;

public class Personaje {
    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private int habilidad1;
    private int habilidad2;
    private int habilidad3;
    
    public Personaje(String nombre, String descripcion, String apodo, float dineroInicial, int habilidad1,
            int habilidad2, int habilidad3) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
        this.habilidad3 = habilidad3;
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
    public void setDineroInicial(float dineroInicial) {
        this.dineroInicial = dineroInicial;
    }
    public int getHabilidad1() {
        return habilidad1;
    }
    public void setHabilidad1(int habilidad1) {
        this.habilidad1 = habilidad1;
    }
    public int getHabilidad2() {
        return habilidad2;
    }
    public void setHabilidad2(int habilidad2) {
        this.habilidad2 = habilidad2;
    }
    public int getHabilidad3() {
        return habilidad3;
    }
    public void setHabilidad3(int habilidad3) {
        this.habilidad3 = habilidad3;
    }

}

