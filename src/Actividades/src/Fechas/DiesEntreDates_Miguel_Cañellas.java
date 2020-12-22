package Fechas;

public class DiesEntreDates_Miguel_Cañellas extends CalcularDiesEntreDates {

    // Aquest metode serveix per gaurdar el dies de cada més.

    @Override
    protected int diesMes(int mes) {

        int [] diesMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return diesMes[mes - 1];

    }

    // Aquest metode serveix per calcular els dies que queden per acabar el més desde el dia que et posen per teclat.

    @Override
    protected int diesMesInicial(DataXS dataXS) {

        return diesMes(dataXS.mes) - dataXS.dia;

    }

    // Aquest metode serveix per calcular els dies que falten per arribar a la data destí desde el dia 1 del més fins el dia de la data desti.

    @Override
    protected int diesMesDesti(DataXS dataXS) {

        return dataXS.dia;

    }

    // Aquest metode serveix per calcular els dies que queden per acabar l'any desde el dia que et posen per teclat.

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {

        int diesRestants = 0;

        for (int i = 1; i <= 12 - datainicial.mes; i++) {

            diesRestants += diesMes(datainicial.mes + i);

        }

        return diesRestants;

    }

    // Aquest metode serveix per calcular els dies que falten per arribar a la data destí desde el dia 1 de l'any fins el dia de la data desti.

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {

        int diesRestants = 0;

        for (int i = 1; i <= (datadesti.mes - 1); i++){

            diesRestants += diesMes(datadesti.mes - i);

        }

        return diesRestants;

    }

    // Aquest metode calcula quans d'anys hi ha entre una data i l'altre i multiplica per 365 dies per calcular el dies totals.

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {

        return ((datadesti.any - datainicial.any) -1) * 365;

    }

    // Aquest metode comprova si l'any es de traspas i suma un dia a l'any que ho es.

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {

        int any = 0;

        for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {

            if (anyDeTraspas(datainicial.any + i)) {

                any ++;

            }
        }

        if (anyDeTraspas(datadesti.any)){

            any ++;

        }

        return any;

    }

    // Aques metode es la formula cada quan hi ha un any de traspas.

    @Override
    protected boolean anyDeTraspas(int any) {

        return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));

    }
}
