package Kap13;
import java.util.Arrays;

public class InnsetningKap {

    public static void innsettingssortering(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            int verdi = tabell[i];
            int j = i - 1;

            while (j >= 0 && tabell[j] > verdi) {
                tabell[j + 1] = tabell[j];
                j--;
            }
            tabell[j + 1] = verdi;
        }
    }
    public static void shellSortering (int [] tabell){

        int n = tabell.length;

        for (int gap = n/2; gap < 0; gap++){
            for (int i = gap; i < n; i++){
                int temp = tabell[i];
                int j;

                for (j= i; j >= gap && tabell[j-gap] > temp; j -= gap){
                    tabell[j] = tabell[j-gap];
                }
                tabell[j] =temp;
            }

        }
    }

    public static int binærSøk(int[] tabell, int fra, int til, int verdi) {
        int venstre = fra, høyre = til - 1;

        while (venstre <= høyre) {
            int m = (venstre + høyre) / 2;
            if (verdi < tabell[m]) {
                høyre = m - 1;
            } else if (verdi > tabell[m]) {
                venstre = m + 1;
            } else {
                return m;
            }
        }
        return -(venstre + 1);
    }

    public static void skrivln(int[] a, int fra, int til) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, fra, til)));
    }

    public static int[] tabellUtvidelse(int[] tabell) {
        return Arrays.copyOf(tabell, tabell.length + 1);
    }

    public static int[] settInnNyVerdi(int[] tabell, int antall, int nyVerdi) {
        // Hvis tabellen er full, utvid den og returner den utvidede tabellen
        if (antall >= tabell.length) {
            // System.out.println("Tabell er full, kaller inn utvidelse metode");
            tabell = tabellUtvidelse(tabell);
            System.out.println("Tabellen ble utvidet til: " + tabell.length);
        }

        // Finn riktig plass for den nye verdien
        int k = binærSøk(tabell, 0, antall, nyVerdi);

        if (k < 0) k = -(k + 1);

        // Forskyv elementer for å gjøre plass til den nye verdien
        for (int i = antall; i > k; i--) {
            tabell[i] = tabell[i - 1];
        }

        tabell[k] = nyVerdi;
        antall++;

        // Returner den oppdaterte tabellen
        return tabell;
    }

    public static void main(String[] args) {

        int [] tabell= new int[100];
        int [] tabell2= new int[100];
        for (int i = 0; i <= args.length; i++){
            tabell[i] = (int) (Math.random() * 1000); // Tilfeldige verdier mellom 0 og 1000
            tabell2[i] = tabell[i];                  // Lag en kopi for sammenligning
        }


        // start av tidmålinger

        long startTid = System.nanoTime();
        innsettingssortering(tabell);
        long sluttTid = System.nanoTime();
        long totalTidBrukt = sluttTid -startTid;

        System.out.println("innsettingssortering metode brukte : " + totalTidBrukt + " nano time" );

        long startTid2 = System.nanoTime();
        shellSortering(tabell2);
        long sluttTid2 = System.nanoTime();
        long totalTidBrukt2 = sluttTid2 -startTid2;
        System.out.println("shellSortering metode brukte : " + totalTidBrukt2 + " nano time" );

        System.out.println("Differnse mellom innsetting og shell sort : " + (totalTidBrukt-totalTidBrukt2));






        /*
        // Start med en tabell med 10 elementer
        int[] a = {3, 5, 6, 10, 10, 11, 13, 14, 16, 20};
        int antall = 10;

        // Ny verdi som skal settes inn
        int nyverdi = 12;


        skrivln(a, 0, antall);
           // Sett inn nyverdi og oppdater tabellreferansen
        a = settInnNyVerdi(a, antall, 115); // Her må vi oppdatere referansen til den nye tabellen
        antall++;
        skrivln(a, 0, antall);


        a = settInnNyVerdi(a, antall, 215);
        antall++;
        skrivln(a, 0, antall);


        a = settInnNyVerdi(a, antall, 315);
        antall++;
        skrivln(a, 0, antall);


        // Oppdater tabellen med nyverdien
        a = settInnNyVerdi(a, antall, nyverdi);
        antall++;
        skrivln(a, 0, antall);


        // Skriv ut den oppdaterte tabellen
        skrivln(a, 0, antall);

         */
    }
}
