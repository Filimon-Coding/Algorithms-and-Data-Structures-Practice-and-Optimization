package AiOppgaveSamlingen;

public class Oppgave3 {
    public static int [] maksOgNesteMaks (int [] tabell){
        int maks = tabell[0];
        int nestMaks = tabell[0];
        for (int i = 0; i < tabell.length; i++){
            if (maks < tabell[i]){
                nestMaks = maks;
                maks = tabell[i];

            }

        }

        return new int []{maks, nestMaks};
    }

    public static void main(String[] args) {
        int [] tabellList = {25,32,3,4,5,2,39,4,23,4,3};

        int [] svar = maksOgNesteMaks(tabellList);
        System.out.println("Maks er " + svar[0] + " Neste maks " + svar[1]);
    }
}
