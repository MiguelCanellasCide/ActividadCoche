package Actividades.Coche;

public class Coche_Miguel_Cañellas extends CotxeAbstracte {


    //Attriubutes

    private EstatsMotorCotxe estado = EstatsMotorCotxe.Aturat;

    public Coche_Miguel_Cañellas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    //Methods

    @Override
    public void arrancarMotor() throws Exception {

        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {

            throw new Exception("El coche ya esta en marcha.");
        }

        this.estado = EstatsMotorCotxe.EnMarxa;
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return estado;
    }

    @Override
    public int getRevolucions() {
        int revoluciones=0;
        if (estado.equals(EstatsMotorCotxe.Aturat)) {

            revoluciones = 0;

        }

        else if (estado.equals(EstatsMotorCotxe.EnMarxa)) {

            revoluciones = (int) (Math.random() * 6500 + 1);

        }

            return revoluciones;
    }

    @Override
    public void aturarMotor() throws Exception {

        if (estado.equals(EstatsMotorCotxe.Aturat)) {

            throw new Exception("El coche ya está parado.");
        }

        this.estado = EstatsMotorCotxe.Aturat;

    }
}

