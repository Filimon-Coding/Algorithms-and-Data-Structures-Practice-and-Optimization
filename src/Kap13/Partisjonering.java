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
            int[] a = {3,4,1,3,4,2,2,1,2,4};
            int[] b = {3,4,1,3,4,2,2,1,2,4};

           //
            System.out.println("Tabellen før partisjonering:");
            for (int i : b) {
                System.out.print(i + " ");
            }
            System.out.println("\n" +" ------------------------------------------------------");
            ///


            
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

