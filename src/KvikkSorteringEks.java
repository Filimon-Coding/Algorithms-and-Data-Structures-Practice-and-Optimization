public class KvikkSorteringEks {

    // Kvikksorteringsmetoden som bruker rekursjon
    public static void kvikkSortering(int[] tabellList, int venstre, int høyre) {
        if (venstre < høyre) {
            // Velg en skilleverdi (her velger vi midtpunktet)
            int midten = venstre + (høyre - venstre) / 2;
            int skilleverdi = tabellList[midten];

            // Partisjoner tabellen og få den nye posisjonen til skilleverdien
            int partiPosisjon = partisjoner(tabellList, venstre, høyre, skilleverdi);

            // Sorter venstre del
            kvikkSortering(tabellList, venstre, partiPosisjon - 1);
            // Sorter høyre del
            kvikkSortering(tabellList, partiPosisjon, høyre);
        }
    }

    // Partisjoneringsmetoden
    private static int partisjoner(int[] a, int venstre, int høyre, int skilleverdi) {
        while (true) {
            // Finn en verdi som er større eller lik skilleverdien på venstre side
            while (venstre <= høyre && a[venstre] < skilleverdi) venstre++;

            // Finn en verdi som er mindre enn skilleverdien på høyre side
            while (venstre <= høyre && a[høyre] >= skilleverdi) høyre--;

            // Hvis venstre indeks (venstre) er mindre enn høyre, bytt verdiene
            if (venstre < høyre) {
                bytt(a, venstre++, høyre--);
            } else {
                return venstre;  // Returner posisjonen til skilleverdien
            }
        }
    }

    // Bytt-metode for å bytte to elementer i tabellen
    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Hjelpemetode for å skrive ut tabellen
    public static void skrivUtArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();  // Ny linje etter utskrift
    }

    // Main-metoden for å teste kvikksortering
    public static void main(String[] args) {
        // Eksempel på en usortert tabell
        int[] testList = {8, 3, 15, 13, 1, 9, 20, 3, 18, 2, 6};

        // Skriv ut tabellen før sortering
        System.out.println("Før sortering:");
        skrivUtArray(testList);

        // Kall på kvikksortering for å sortere hele tabellen
        kvikkSortering(testList, 0, testList.length - 1);

        // Skriv ut tabellen etter sortering
        System.out.println("Etter sortering:");
        skrivUtArray(testList);
    }
}
