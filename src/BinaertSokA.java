import java.util.Arrays;

public class BinaertSokA {

    // Metode for å utføre binærsøk på en sortert array
    public static int binaertSok(int[] tabell, int verdi) {
        // Sjekker om tabellen er tom
        if (tabell.length <= 0) {
            System.out.println("Tabell er tomt");
            return -1; // Returnerer -1 hvis tabellen er tom
        }

        int venstre = 0;                   // Startindeks for venstre grense
        int høyre = tabell.length - 1;      // Startindeks for høyre grense

        // Løkke for å fortsette søket så lenge venstre grense er mindre eller lik høyre
        while (venstre <= høyre) {
            int midtIndeks = venstre + ((høyre - venstre) / 2); // Beregner midtpunktet

            // Sjekker om verdien på midtpunktet er den vi leter etter
            if (tabell[midtIndeks] == verdi) {
                return midtIndeks; // Returnerer indeksen hvis verdien er funnet
            } else if (tabell[midtIndeks] < verdi) {
                venstre = midtIndeks + 1; // Justerer venstre grense hvis verdien er større
            } else {
                høyre = midtIndeks - 1; // Justerer høyre grense hvis verdien er mindre
            }
        }
        return -1; // Returnerer -1 hvis verdien ikke finnes i tabellen
    }

    // Rekursiv metode for å beregne tverrsummen av et tall
    public static int tverrrsum(int n) {
        // Basistilstand: hvis n er et ensifret tall, returneres n
        if (n < 10) {
            return n;
        } else {
            // Rekursiv oppdeling: legg til siste siffer og kall metoden på resten av tallet
            return tverrrsum(n / 10) + (n % 10);
        }
    }

    // Rekursiv binærsøk-metode (alternativ til binaertSok) som bruker rekursjon
    public static int rekrusikBiSøk(int[] a, int fra, int til, int verdi) {
        // Basistilstand: returner -1 hvis startindeksen er større enn sluttindeksen
        if (fra > til) {
            return -1;
        }

        int midt = (fra + til) / 2; // Beregner midtpunktet mellom start og slutt

        // Sjekker om midtpunktet inneholder verdien vi søker etter
        if (a[midt] == verdi) {
            return midt; // Returnerer indeksen hvis verdien er funnet
        } else if (a[midt] > verdi) {
            // Hvis midtpunktverdien er større enn verdien, søk i venstre del
            return rekrusikBiSøk(a, fra, midt - 1, verdi);
        } else {
            // Hvis midtpunktverdien er mindre enn verdien, søk i høyre del
            return rekrusikBiSøk(a, midt + 1, til, verdi);
        }
    }

    // Rekursiv metode for å beregne Fibonacci-tallet ved et gitt indeks n
    public static int fibonacci(int n) {
        // Basistilstandene for Fibonacci-rekken
        if (n == 0) {
            return 0; // Hvis n er 0, returneres 0
        }
        if (n == 1) {
            return 1; // Hvis n er 1, returneres 1
        } else {
            // Rekursiv oppdeling: summen av de to foregående Fibonacci-tallene
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Hovedmetoden for å teste de andre metodene
    public static void main(String[] args) {

        System.out.println("-------------------------");

        // Tester fibonacci-metoden
        int b = 5;
        System.out.println("Fibonacci av " + b + ": " + fibonacci(b));

        System.out.println("-------------------------");

        // Oppretter en tabell, sorterer den og tester rekursiv binærsøk
        int[] tabell = {12, 2, 11, 13, 5, 6};
        Arrays.sort(tabell); // Sorterer tabellen før binærsøk
        int indeks = rekrusikBiSøk(tabell, 0, tabell.length - 1, 6); // Søk etter verdien 6
        System.out.println("Indeks for verdi 6: " + indeks); // Skriver ut indeksen

        System.out.println("-------------------------");

        // Tester tverrsum-metoden
        int a = 7295;
        int sum = tverrrsum(a); // Beregner tverrsummen av 7295
        System.out.println("Tverrsum av " + a + ": " + sum); // Skriver ut tverrsummen

        System.out.println("-------------------------");
    }
}
