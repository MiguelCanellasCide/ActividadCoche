package Actividades.Coche;

public class Main {

    public static void main(String[] args) {
        Coche_Miguel_Cañellas c1= new Coche_Miguel_Cañellas("Ferrari","G1",TipusCanvi.CanviManual);
        try {
            System.out.println(c1.getRevolucions());
            System.out.println(c1.comprovaMotor());
            c1.arrancarMotor();
            System.out.println(c1.comprovaMotor());
            System.out.println(c1.getRevolucions());
            c1.aturarMotor();
            System.out.println(c1.comprovaMotor());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

