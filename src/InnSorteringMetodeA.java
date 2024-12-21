 class InnsorteringMetodeLese {
     // Metode for innsortering
     public static void innsortering(int[] tabell) {
         int n = tabell.length;

         // Gå gjennom alle elementene fra indeks 1 til n-1
         for (int i = 1; i < n; i++) {
             int nøkkel = tabell[i];  // Lagre nåværende element som nøkkel
             int j = i - 1;

             // Flytt elementer som er større enn nøkkelen én posisjon til høyre
             while (j >= 0 && tabell[j] > nøkkel) {
                 tabell[j + 1] = tabell[j];
                 j--;
             }

             // Sett inn nøkkelen på riktig plass
             tabell[j + 1] = nøkkel;
         }
     }

}
    public class InnSorteringMetodeA {
        public static void main(String[] args) {
            int[] tabell = {12, 11, 13, 5, 6};
            InnsorteringMetodeLese.innsortering(tabell); // Kall til innsorteringsmetoden

            // Skriv ut den sorterte tabellen
            System.out.print("Sortert tabell: ");
            for (int tall : tabell) {
                System.out.print(tall + " ");
            }
        }


    }

