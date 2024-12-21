package Kap13;

public class ForskyvRightShift {

    // Metode for å forskyve en heltallstabell mot høyre
    public static void rightshift(int[] a, int d) {
        // Sjekker om d er negativ, og kaster en feil hvis det er tilfelle
        if (d < 0) {
            throw new IllegalArgumentException("Negativ parameter! Forskyning kan ikke være negativ.");
        }

        // Hvis tabellen har 1 eller færre elementer, er det ingenting å forskyve, så vi avslutter tidlig
        if (a.length <= 1) {
            return;  // Ingenting å forskyve
        }

        // Begrense d til tabellens lengde. Hvis d er større enn lengden på tabellen, forskyver vi d % tabellengde
        d %= a.length;

        // Første for-løkke: Forskytter elementene fra slutten av tabellen mot høyre
        // Starter fra siste element i tabellen og går bakover
        for (int i = a.length - 1; i >= d; i--) {
            // Flytt verdien fra posisjon (i - d) til posisjon i
            a[i] = a[i - d];
        }

        // Andre for-løkke: Fyller de første d plassene med verdien fra a[0]
        for (int i = 0; i < d; i++) {
            // Setter de første d elementene til verdien som opprinnelig var i a[0]
            a[i] = a[0];
        }
    }

    // Hjelpemetode for å skrive ut tabellen
    public static void skrivUtTabell(int[] a) {
        // Går gjennom hvert element i tabellen og skriver ut
        for (int i : a) {
            System.out.print(i + " ");  // Skriv ut hvert element, etterfulgt av et mellomrom
        }
        System.out.println();  // Linjeskift etter tabellen er skrevet ut
    }

    // Hovedmetode for testing av rightshift
    public static void main(String[] args) {
        // Eksempel-tabell for testing
        int[] tabell = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Skriver ut tabellen før forskyvningen
        System.out.println("Tabellen før rightshift:");
        skrivUtTabell(tabell);

        // Forskyvning av tabellen 3 plasser mot høyre
        rightshift(tabell, 3);  // Vi forskyver tabellen 3 plasser mot høyre

        // Skriver ut tabellen etter forskyvningen
        System.out.println("\nTabellen etter rightshift (3 plasser):");
        skrivUtTabell(tabell);
    }
}
