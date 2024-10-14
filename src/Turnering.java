public class Turnering {

    public static int[] finnStørsteOgNestStørste(int[] tall) {
        if (tall.length < 2) {
            throw new IllegalArgumentException("Tabellen må ha minst to elementer.");
        }

        // Opprett en "turnering"
        return turnering(tall, 0, tall.length - 1);
    }

    // Rekursiv metode for å gjennomføre turneringen
    private static int[] turnering(int[] tall, int start, int slutt) {
        if (start == slutt) {
            return new int[]{tall[start], Integer.MIN_VALUE};  // Returner elementet
        }

        // Finn midten og kjør turnering på venstre og høyre halvdel
        int midt = (start + slutt) / 2;
        int[] venstre = turnering(tall, start, midt);
        int[] høyre = turnering(tall, midt + 1, slutt);

        // Sammenlign vinnerne fra venstre og høyre halvdel
        int største;
        int nestStørste;
        if (venstre[0] > høyre[0]) {
            største = venstre[0];
            nestStørste = Math.max(venstre[1], høyre[0]);
        } else {
            største = høyre[0];
            nestStørste = Math.max(høyre[1], venstre[0]);
        }

        return new int[]{største, nestStørste};  // Returner største og nest største
    }

    public static int inversjoner(int[] a) {
        int antall = 0;  // Teller antall inversjoner
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    antall++;  // Øk antall inversjoner hvis elementene er i utakt
                }
            }
        }
        return antall;
    }

    public static void boblesorteringOptimalisert(int[] a) {
        boolean byttet;  // Variabel som holder styr på om vi har byttet i en runde
        for (int n = a.length; n > 1; n--) {
            byttet = false;  // Sett byttet til false ved starten av hver runde
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    bytt(a, i - 1, i);  // Bytt hvis elementene er i feil rekkefølge
                    byttet = true;  // Marker at vi har gjort et bytte
                }
            }
            // Hvis vi ikke har byttet i løpet av runden, er listen sortert
            if (!byttet) {
                break;
            }
        }
    }

    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



    public static void main(String[] args) {
        int[] tall = {3, 8, 1, 7, 6, 10, 4};
        int[] result = finnStørsteOgNestStørste(tall);
        System.out.println("Største: " + result[0] + ", Nest største: " + result[1]);

        int[] a = {1, 2, 4, 3, 6, 7, 9, 5, 8, 10};
        System.out.println(inversjoner(a));  // Utskrift: 5

        System.out.println("________________________________________________" + "\n" +
                "___________________________________________________________");

        int[] tallA = {5, 1, 4, 2, 8};
        int[] tallB = {1, 2, 3, 4, 5};

        boblesorteringOptimalisert(tallA);
        boblesorteringOptimalisert(tallB);

        // Skriv ut det sorterte arrayet
        for (int i : tallA) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "________________________________________________" + "\n" +
                "_______________________________________________");

        // Skriv ut det sorterte arrayet
        for (int i : tallB) {
            System.out.print(i + " ");
        }



    }
}
