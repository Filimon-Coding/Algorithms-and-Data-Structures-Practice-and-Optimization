package Kap13;

public class Rotasjon {

    // Metode for å rotere en tabell
    public static void rotasjon(int[] a, int d) {
        int n = a.length;
        d = d % n;  // Sikrer at d ikke er større enn tabellens lengde
        if (d < 0) d += n;  // Hvis d er negativ, roterer vi mot venstre

        // Reverser hele tabellen
        reverser(a, 0, n - 1);

        // Reverser de første d elementene
        reverser(a, 0, d - 1);

        // Reverser de resterende elementene
        reverser(a, d, n - 1);
    }

    // Hjelpemetode for å reversere en del av en tabell
    public static void reverser(int[] a, int start, int slutt) {
        while (start < slutt) {
            int temp = a[start];
            a[start] = a[slutt];
            a[slutt] = temp;
            start++;
            slutt--;
        }
    }

    // Hjelpemetode for å skrive ut en tabell
    public static void skrivUt(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Hovedmetode for testing av rotasjon
    public static void main(String[] args) {
        int[] tabell = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Før rotasjon:");
        skrivUt(tabell);

        rotasjon(tabell, 3);  // Roterer tabellen 3 plasser mot høyre

        System.out.println("Etter rotasjon (3 plasser mot høyre):");
        skrivUt(tabell);
    }
}
