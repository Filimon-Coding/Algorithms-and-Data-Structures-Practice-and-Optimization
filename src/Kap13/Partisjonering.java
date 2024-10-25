package Kap13;

public class Partisjonering {
    public static int parter0(int[] a, int v, int h, int skilleverdi) {
        while (true) {
            while (a[v] < skilleverdi) v++;   // Flytter v mot høyre til en verdi >= skilleverdi
            while (a[h] >= skilleverdi) h--;  // Flytter h mot venstre til en verdi < skilleverdi
            if (v >= h) return v;             // Returnerer når v og h krysser hverandre
            bytt(a, v++, h--);                // Bytter plass på verdiene i v og h, og flytter videre
        }
    }
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

        public static void main(String[] args) {
            int[] a = {8, 3, 15, 13, 1, 9, 20, 3, 18, 2, 6, 25, 14, 8, 20, 16, 5, 21, 11, 14};
            System.out.println("Tabellen før partisjonering:");
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("\n" +" ------------------------------------------------------");


            int skilleverdi = 3;
            int resultat = parter0(a, 0, a.length - 1, skilleverdi);

            System.out.println("Tabellen etter partisjonering:");
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("\nResultat: " + resultat);
        }



}

