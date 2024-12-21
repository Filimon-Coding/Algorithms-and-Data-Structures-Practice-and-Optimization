/*

package BeholderPac;



import java.util.Iterator;

public class tabellBeholder<T> implements Beholder<T> {
    private T[] a;       // Tabell som holder elementene
    private int antall;  // Antall elementer i beholderen

    // Konstruktør som oppretter en tom tabell med en viss størrelse
    public tabellBeholder(int størrelse) {
        a = (T[])new Object[størrelse];  // Opprett tabell
        antall = 0;  // Beholderen er tom i starten
    }

    // Legg inn et element i beholderen
    @Override
    public boolean leggInn(T verdi) {
        // Sjekk om tabellen er full
        if (antall == a.length) {
            System.out.println("Beholderen er full, kan ikke legge til flere elementer.");
            return false;
        }
        a[antall++] = verdi;  // Legg til verdien og øk antall
        return true;  // Returner true, vellykket innlegging
    }

    // Sjekk om verdien finnes i beholderen
    @Override
    public boolean inneholder(T verdi) {
        for (int i = 0; i < antall; i++) {
            if (a[i].equals(verdi)) {
                return true;  // Returner true hvis verdien finnes
            }
        }
        return false;  // Returner false hvis verdien ikke finnes
    }

    // Fjern et element fra beholderen
    @Override
    public boolean fjern(T verdi) {
        for (int i = 0; i < antall; i++) {
            if (a[i].equals(verdi)) {
                // Flytt alle elementene til venstre
                for (int j = i; j < antall - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[--antall] = null;  // Reduser antallet og nullstill siste plass
                return true;  // Returner true hvis fjerningen var vellykket
            }
        }
        return false;  // Returner false hvis verdien ikke ble funnet
    }

    // Returner antallet elementer i beholderen
    @Override
    public int antall() {
        return antall;  // Returner antallet elementer i beholderen
    }

    // Nullstill beholderen ved å tømme den
    @Override
    public void nullstill() {
        for (int i = 0; i < antall; i++) {
            a[i] = null;  // Fjern alle elementene
        }
        antall = 0;  // Sett antallet til 0
    }

    // Implementering av iterator (brukes ikke direkte her)
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Iterator ikke implementert.");
    }

    // Test programmet i main-metoden
    public static void main(String[] args) {
        // Opprett en beholder for heltall med plass til 5 elementer
        tabellBeholder<Integer> beholder = new tabellBeholder<>(5);

        // Test leggInn-metoden
        beholder.leggInn(1);
        beholder.leggInn(2);
        beholder.leggInn(3);
        beholder.leggInn(4);
        beholder.leggInn(5);
        beholder.leggInn(6);  // Skal ikke kunne legges til, beholder er full

        // Test inneholder-metoden
        System.out.println("Inneholder 3? " + beholder.inneholder(3));  // true
        System.out.println("Inneholder 6? " + beholder.inneholder(6));  // false

        // Test fjern-metoden
        beholder.fjern(3);  // Fjern 3
        System.out.println("Inneholder 3 etter fjerning? " + beholder.inneholder(3));  // false

        // Test antall-metoden
        System.out.println("Antall elementer i beholderen: " + beholder.antall());  // 4

        // Test nullstill-metoden
        beholder.nullstill();
        System.out.println("Antall elementer etter nullstilling: " + beholder.antall());  // 0
    }
}

 */
