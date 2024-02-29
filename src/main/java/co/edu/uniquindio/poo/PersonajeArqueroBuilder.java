package co.edu.uniquindio.poo;

public class PersonajeArqueroBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private String habilidad1;
    private String habilidad2;
    private String habilidad3;
    private String tipo;

    private PersonajeArqueroBuilder() {}

    public PersonajeArqueroBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonajeArqueroBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public PersonajeArqueroBuilder apodo(String apodo) {
        this.apodo = apodo;
        return this;
    }
    
    public PersonajeArqueroBuilder dineroInicial(float dineroInicial) {
        this.dineroInicial = dineroInicial;
        return this;
    }

    public PersonajeArqueroBuilder habilidad1(String habilidad1) {
        this.habilidad1 = habilidad1;
        return this;
    }

    public PersonajeArqueroBuilder habilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
        return this;
    }

    public PersonajeArqueroBuilder habilidad3(String habilidad3) {
        this.habilidad3 = habilidad3;
        return this;
    }
    
    public PersonajeArqueroBuilder tipo() {
        this.tipo = "arquero"; // Establecer el tipo como "arquero"
        return this;
    }

    public Personaje build() {
        return new Personaje(nombre, descripcion, apodo, dineroInicial, habilidad1, habilidad2, habilidad3, tipo);
    }
}
