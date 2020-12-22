package Fechas;

public class Main {

    public static void main (String [] args) {

        DiesEntreDates_Miguel_Cañellas d1 = new DiesEntreDates_Miguel_Cañellas();
        try {
            DataXS fechaInicial = new DataXS("01/02/2014");
            DataXS fechaFinal= new DataXS("28/04/2014");
            System.out.println (d1.nombreDiesTotals(fechaInicial,fechaFinal));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
