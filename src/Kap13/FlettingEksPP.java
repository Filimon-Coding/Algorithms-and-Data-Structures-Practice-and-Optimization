package Kap13;
import java.util.Arrays;

public class FlettingEksPP {

    // Metode for å flette to sorterte tabeller til én sortert tabell
    public static int[] flett(int[] a, int[] b) {
        int[] resultat = new int[a.length + b.length]; // Den nye flettede tabellen
        int i = 0, j = 0, k = 0; // Indekser for a, b og resultat

        // Fletter elementene fra begge tabellene
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                resultat[k++] = a[i++]; // Legger til fra tabell a
            } else {
                resultat[k++] = b[j++]; // Legger til fra tabell b
            }
        }

        // Hvis det er flere elementer igjen i tabell a, legg dem til resultatet
        while (i < a.length) {
            resultat[k++] = a[i++];
        }

        // Hvis det er flere elementer igjen i tabell b, legg dem til resultatet
        while (j < b.length) {
            resultat[k++] = b[j++];
        }

        return resultat; // Returnerer den flettede tabellen
    }

    public static void main(String[] args) {
        // To eksempel-tabeller som skal flettes
        int[] tabell1 = {1, 3, 5, 7};
        int[] tabell2 = {2, 4, 6, 8, 10};

        // Kall flettemetoden
        int[] flettetTabell = flett(tabell1, tabell2);

        // Skriv ut resultatet av flettingen
        System.out.println("Flettet tabell: " + Arrays.toString(flettetTabell));
    }
}
