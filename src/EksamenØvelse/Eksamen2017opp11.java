package EksamenØvelse;

public class Eksamen2017opp11 {

    public static void frekvensFordeling(int[] a) {
        if (a.length == 0) {
            System.out.println(0 + " " + 0); // Hvis tabellen er tom
            return;
        }

        int temp = a[0]; // Starter med den første verdien i tabellen
        int frekvens = 1; // Starter frekvensen på 1 for den første verdien

        for (int i = 1; i < a.length; i++) {
            if (temp == a[i]) { // Hvis verdien er lik forrige verdi
                frekvens++;
            } else if (temp < a[i]) { // Hvis en ny verdi er funnet (tabellen antas å være sortert)
                System.out.println("Verdi: " + temp + ", Frekvens: " + frekvens);
                temp = a[i]; // Oppdaterer `temp` til den nye verdien
                frekvens = 1; // Tilbakestiller frekvensen
            }
        }

        // Skriv ut den siste verdien og dens frekvens
        System.out.println("Verdi: " + temp + ", Frekvens: " + frekvens);
    }

    public static void main(String[] args) {
        int[] test = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

        // Kaller metoden
        frekvensFordeling(test);
    }

}
