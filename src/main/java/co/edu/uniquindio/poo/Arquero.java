package co.edu.uniquindio.poo;

public class Arquero extends Personaje implements ValidadorAtributo  {
    private int destreza;
    private int agilidad;
    private int precision;
    private final HabilidadArquero habilidadArquero;

    public Arquero(String nombre, String descripcion, String apodo, float dineroInicial, int destreza, int agilidad, int precision, HabilidadArquero habilidadArquero) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
        this.habilidadArquero = habilidadArquero;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    public HabilidadArquero getHabilidadArquero(){
        return habilidadArquero;
    }
    @Override
    public boolean atributosCorrectos(Personaje personaje) {
        if (!(personaje instanceof Arquero)) {
            return false;
        }

        Arquero arquero = (Arquero) personaje;
        if (arquero.getDestreza() < 0 || arquero.getAgilidad() < 0 || arquero.getPrecision() < 0) {
            return false;
        }
        return true;
    }
}
