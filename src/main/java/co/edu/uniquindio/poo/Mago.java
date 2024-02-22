package co.edu.uniquindio.poo;

public class Mago extends Personaje implements ValidadorAtributo  {
    private int inteligencia;
    private int sabiduria;
    private int energiaMagica;
    private final HabilidadMago habilidadMago;

    public Mago(String nombre, String apodo, String descripcion, float dineroInicial, int inteligencia, int sabiduria, int energiaMagica, HabilidadMago habilidadMago) {
        super(nombre, apodo, descripcion, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
         this.habilidadMago = habilidadMago;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
    public HabilidadMago getHabilidadMago(){
        return habilidadMago;
    }
    @Override
    public boolean atributosCorrectos(Personaje personaje) {
        if (!(personaje instanceof Mago)) {
            return false;
        }

        Mago mago = (Mago) personaje;
        if (mago.getInteligencia() < 0 || mago.getSabiduria() < 0 || mago.getEnergiaMagica() < 0) {
            return false;
        }
        return true;
    }
}

    
