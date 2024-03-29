package co.edu.uniquindio.poo;

public interface BuilderPersonaje {
    BuilderPersonaje nombre(String nombre);
    BuilderPersonaje descripcion(String descripcion);
    BuilderPersonaje apodo(String apodo);
    BuilderPersonaje dineroInicial(float dineroInicial);
    BuilderPersonaje habilidad1(int habilidad1);
    BuilderPersonaje habilidad2(int habilidad2);
    BuilderPersonaje habilidad3(int habilidad3);
}
