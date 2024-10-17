import java.util.Arrays;

public class Flettesortering {

    // Hovedmetode som starter flettesorteringen
    public static void flettesortering(int[] a) {
        int[] b = new int[a.length];  // Hjelpetabell for fletting
        flettesortering(a, b, 0, a.length);  // Kaller den rekursive metoden
    }

    // Rekursiv flettesorteringsmetode
    private static void flettesortering(int[] a, int[] b, int fra, int til) {
        // Basistilfelle: Når tabellen har ett eller ingen elementer, er den sortert
        if (til - fra <= 1) return;

        int midt = (fra + til) / 2;   // Finn midtpunktet for å dele tabellen i to

        // Rekursivt kall på venstre halvdel
        flettesortering(a, b, fra, midt);

        // Rekursivt kall på høyre halvdel
        flettesortering(a, b, midt, til);

        // Etter at begge delene er sortert, fletter vi dem sammen
        flett(a, b, fra, midt, til);
    }

    // Metode for å flette sammen to sorterete deler
    private static void flett(int[] a, int[] b, int fra, int midt, int til) {
        int i = fra, j = midt, k = fra;   // Startindekser for venstre, høyre og samlet del

        // Kopierer venstre halvdel (a[fra:midt>) til hjelpetabellen b
        for (int l = fra; l < midt; l++) {
            b[l] = a[l];
        }

        // Fletter sammen de to delene
        while (i < midt && j < til) {
            if (b[i] <= a[j]) {
                a[k++] = b[i++];   // Hvis elementet i venstre del er mindre eller lik
            } else {
                a[k++] = a[j++];   // Hvis elementet i høyre del er mindre
            }
        }

        // Kopierer over eventuelle rester fra venstre del (hvis noen)
        while (i < midt) {
            a[k++] = b[i++];
        }
    }

    // Hovedprogrammet for å teste flettesorteringen
    public static void main(String[] args) {
        // Lager en enkel tabell for testing
        int[] a = {38, 27, 43, 3, 9, 82, 10};

        // Skriver ut tabellen før sortering
        System.out.println("Før sortering: " + Arrays.toString(a));

        // Kaller flettesorteringsmetoden
        flettesortering(a);

        // Skriver ut tabellen etter sortering
        System.out.println("Etter sortering: " + Arrays.toString(a));
    }
}
