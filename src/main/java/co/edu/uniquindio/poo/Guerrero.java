package co.edu.uniquindio.poo;

public class Guerrero extends Personaje implements ValidadorAtributo {
    private int fuerza;
    private int resistencia;
    private int vitalidad;
    private final HabilidadGuerrero habilidadGuerrero;

    public Guerrero(String nombre, String descripcion, String apodo, float dineroInicial, int fuerza, int resistencia, int vitalidad, HabilidadGuerrero habilidadGuerrero) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
        this.habilidadGuerrero = habilidadGuerrero;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    public HabilidadGuerrero getHabilidadGuerrero(){
        return habilidadGuerrero;
    }
    @Override
    public boolean atributosCorrectos(Personaje personaje) {
        if (!(personaje instanceof Guerrero)) {
            return false;
        }

        Guerrero guerrero = (Guerrero) personaje;
        if (guerrero.getFuerza() < 0 || guerrero.getResistencia() < 0 || guerrero.getVitalidad() < 0) {
            return false;
        }
        return true;
    }
}
