package co.edu.uniquindio.poo;

// ConcreteBuilder para construir guerreros
public class PersonajeGuerreroBuilder implements BuilderPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private int espadaAfilada;
    private int golpeDefinitivo;
    private int escudoProtector;

    public PersonajeGuerreroBuilder() {}

    public static PersonajeGuerreroBuilder builder() {
        return new PersonajeGuerreroBuilder();
    }

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

    public PersonajeGuerreroBuilder habilidad1(int espadaAfilada) {
        this.espadaAfilada = espadaAfilada;
        return this;
    }

    public PersonajeGuerreroBuilder habilidad2(int golpeDefinitivo) {
        this.golpeDefinitivo = golpeDefinitivo;
        return this;
    }

    public PersonajeGuerreroBuilder habilidad3(int escudoProtector) {
        this.escudoProtector = escudoProtector;
        return this;
    }

    public Personaje build() {
        // Realizar verificación de atributos aquí
        if (espadaAfilada < 0 || golpeDefinitivo < 0 || escudoProtector < 0) {
            throw new IllegalStateException("Los atributos de Mago no pueden ser cero");
        }
        
        return new Personaje(nombre, descripcion, apodo, dineroInicial, espadaAfilada, golpeDefinitivo, escudoProtector);
    }
}
