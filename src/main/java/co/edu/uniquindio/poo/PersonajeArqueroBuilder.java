package co.edu.uniquindio.poo;

public class PersonajeArqueroBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private int disparoRapido;
    private int flechaVenenosa;
    private int tiroCertero;

    public PersonajeArqueroBuilder() {}


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

    public PersonajeArqueroBuilder habilidad1(int disparoRapido) {
        this.disparoRapido= disparoRapido;
        return this;
    }

    public PersonajeArqueroBuilder habilidad2(int flechaVenenosa) {
        this.flechaVenenosa = flechaVenenosa;
        return this;
    }

    public PersonajeArqueroBuilder habilidad3(int tiroCertero) {
        this.tiroCertero = tiroCertero;
        return this;
    }

    public Personaje build() {
        if (disparoRapido < 0 || flechaVenenosa < 0 || tiroCertero < 0){
            throw new IllegalStateException("Los atributos de Arquero no pueden ser cero");
        }
        return new Personaje (nombre, descripcion, apodo, dineroInicial, disparoRapido, flechaVenenosa, tiroCertero);
    }
}
