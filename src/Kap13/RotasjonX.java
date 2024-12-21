package Kap13;

public class RotasjonX {

    // Metode for å forskyve en tabell mot høyre
    public static void rightshift(int[] a, int d) {
        int n = a.length;
        d = d % n;  // Sikrer at vi ikke forskyver mer enn tabellens lengde
        int[] temp = new int[d];  // Hjelpetabell for å lagre de siste d elementene

        // Kopier de siste d elementene til temp
        for (int i = 0; i < d; i++) {
            temp[i] = a[n - d + i];
        }

        // Flytt resten av elementene mot høyre
        for (int i = n - 1; i >= d; i--) {
            a[i] = a[i - d];
        }

        // Sett de lagrede elementene på begynnelsen
        for (int i = 0; i < d; i++) {
            a[i] = temp[i];
        }
    }

    // Hjelpemetode for å skrive ut en tabell
    public static void skrivUt(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Hovedmetode for testing av forskyvning
    public static void main(String[] args) {
        int[] tabell = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Før forskyvning mot høyre:");
        skrivUt(tabell);

        rightshift(tabell, 3);  // Forskyver tabellen 3 plasser mot høyre

        System.out.println("Etter forskyvning mot høyre (3 plasser):");
        skrivUt(tabell);
    }
}
