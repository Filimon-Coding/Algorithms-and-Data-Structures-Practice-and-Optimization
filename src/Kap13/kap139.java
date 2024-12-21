package Kap13;

import java.util.Arrays;

public class kap139 {

    // Metode for å partisjonere en tabell rundt en skilleverdi (pivot)
    public static int partisjoner(int[] tabell, int venstre, int høyre) {
        int pivot = tabell[høyre];  // Velg skilleverdien (pivot) som siste element
        int i = venstre - 1;        // Største indeks av elementer mindre enn pivot

        for (int j = venstre; j < høyre; j++) {
            // Hvis nåværende element er mindre enn eller lik pivot
            if (tabell[j] <= pivot) {
                i++;  // Øk indeks for mindre elementer
                bytt(tabell, i, j);  // Bytt elementene
            }
        }

        // Sett pivot på riktig plass
        bytt(tabell, i + 1, høyre);

        // Returner indeksen til pivot
        return i + 1;
    }

    // Hjelpemetode for å bytte to elementer i tabellen
    private static void bytt(int[] tabell, int i, int j) {
        int temp = tabell[i];
        tabell[i] = tabell[j];
        tabell[j] = temp;
    }

    // Testmetode for å vise partisjoneringen
    public static void main(String[] args) {
        // Eksempel på tabell
        int[] tabell = {13, 2, 8, 10, 16, 9, 15, 4, 18, 14, 12, 11, 7, 5, 3, 6, 17, 1, 20, 19};

        // Skriv ut tabellen før partisjonering
        System.out.println("Før partisjonering: " + Arrays.toString(tabell));

        // Partisjoner tabellen rundt pivot (skilleverdi)
        int pivotIndeks = partisjoner(tabell, 0, tabell.length - 1);

        // Skriv ut tabellen etter partisjonering
        System.out.println("Etter partisjonering: " + Arrays.toString(tabell));
        System.out.println("Skilleverdi (pivot) er nå på indeks: " + pivotIndeks);
    }
}
