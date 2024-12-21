package AiOppgaveSamlingen;

public class Oppgave1 {
    public static int maks(int [] tabell){
        int maks = tabell[0];
        int indeks = tabell[0];
        for (int i = 0; i < tabell.length; i++){

            if (maks < tabell[i]){
                maks = tabell[i];
                indeks = i;


            }

        }
        return indeks;

    }
    public static boolean erSortert (int [] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) { // unngå å gå utenfor grensene
            if (tabell[i] > tabell[i + 1]) {
                return false;  // hvis vi finner et par som ikke er i rekkefølge, returner false
            }
        }
        return true;  // hvis hele løkken er fullført, er tabellen sortert
    }



    public static int min (int [] tabell){
       int  min = tabell[0];
       int  indeks = tabell[0];
        for (int i = 0; i < tabell.length; i++){

            if (min > tabell[i]){
                min = tabell[i];
                indeks = i;


            }
        }
        return indeks;

    }



    public static void main(String[] args) {

        int [] tabellList = {25,32,3,4,5,2,39,4,23,4,3};
        System.out.println(maks(tabellList));
        System.out.println(min(tabellList));


    }



}
