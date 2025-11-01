package NewAlgData;

public class LineærSøk {

    // Metode for å finne en verdi i en sortert (stigende) tabell
    // Hvis verdien finnes → returner posisjonen (indeksen)
    // Hvis den ikke finnes → returner -(innsettingspunkt + 1)
    public static int lineærsøk(int[] a, int verdi) {

        // Sjekk om tabellen er tom, eller om verdien er større enn den største
        // I så fall skal verdien settes inn etter siste element
        if (a.length == 0 || verdi > a[a.length - 1]) {
            return -(a.length + 1); // negativ verdi betyr "ikke funnet"
        }

        // Gå gjennom tabellen fra venstre mot høyre
        int i = 0;

        // Så lenge nåværende verdi er mindre enn søkeverdien, gå videre
        while (a[i] < verdi) {
            i++;
        }

        // Nå har vi to muligheter:
        // 1. a[i] == verdi → vi fant verdien, returner indeksen
        // 2. a[i] > verdi  → ikke funnet, men her er innsettingspunktet
        if (a[i] == verdi) {
            return i; // funnet på posisjon i
        } else {
            return -(i + 1); // ikke funnet → innsettingspunktet er i
        }
    }

    // Hovedmetode for testing
    public static void main(String[] args) {
        int[] a = {3, 8, 10, 12, 14, 16, 21, 24, 27, 30, 32, 33, 34, 37, 40};

        System.out.println(lineærsøk(a, 32)); // 10 → finnes
        System.out.println(lineærsøk(a, 31)); // -11 → ikke funnet, innsettingspunkt 10
        System.out.println(lineærsøk(a, 2));  // -1 → ikke funnet, innsettingspunkt 0
        System.out.println(lineærsøk(a, 50)); // -16 → ikke funnet, innsettingspunkt 15
    }
}
