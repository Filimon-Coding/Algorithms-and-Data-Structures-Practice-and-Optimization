package Kap311.Ekstra;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class TabellListeX<T> implements ListeX<T> {
    private T[] a;           // en tabell for å lagre elementene i ListeX
    private int antall;      // antall elementer i ListeX

    @SuppressWarnings("unchecked")
    public TabellListeX(int størrelse) {
        a = (T[]) new Object[størrelse];  // Lager en ny tabell av ønsket størrelse
        antall = 0;                       // Setter antallet elementer til 0
    }

    public TabellListeX() {
        this(10);  // Standardkonstruktør med startstørrelse 10
    }

    public TabellListeX(T[] b) {
        this(b.length);  // Setter startstørrelsen til lengden på "b"
        for (T verdi : b) {
            if (verdi != null) a[antall++] = verdi;  // Legger inn verdier som ikke er null
        }
    }

    public int antall() {
        return antall;
    }

    public boolean tom() {
        return antall == 0;
    }

    public T hent(int indeks) {
        indeksKontroll(indeks, false); // Sjekker at indeksen er gyldig
        return a[indeks]; // Returnerer elementet på den gitte indeksen
    }

    public int indeksTil(T verdi) {
        for (int i = 0; i < antall; i++) {
            if (a[i].equals(verdi)) return i;  // Returnerer indeksen til første forekomst
        }
        return -1;  // Returnerer -1 hvis verdien ikke finnes i ListeX
    }

    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;  // Returnerer true hvis indeksen ikke er -1
    }

    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!"); // Sjekker at verdien ikke er null
        if (antall == a.length) { // Hvis tabellen er full, utvider vi den med 50%
            a = Arrays.copyOf(a, (3 * antall) / 2 + 1);
        }
        a[antall++] = verdi; // Legger inn verdien bakerst og øker antall
        return true; // Bekrefter at innleggingen var vellykket
    }

    public void leggInn(int indeks, T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!"); // Sjekker at verdien ikke er null
        indeksKontroll(indeks, true); // Sjekker at indeksen er gyldig for innlegging

        if (antall == a.length) { // Hvis tabellen er full, utvider vi den med 50%
            a = Arrays.copyOf(a, (3 * antall) / 2 + 1);
        }

        System.arraycopy(a, indeks, a, indeks + 1, antall - indeks); // Forskyver elementene til høyre
        a[indeks] = verdi; // Legger inn verdien på den ønskede indeksen
        antall++; // Øker antallet elementer
    }

    public T oppdater(int indeks, T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!"); // Sjekker at verdien ikke er null
        indeksKontroll(indeks, false); // Sjekker at indeksen er gyldig

        T gammelverdi = a[indeks]; // Lagrer den gamle verdien
        a[indeks] = verdi; // Erstattet med den nye verdien
        return gammelverdi; // Returnerer den gamle verdien
    }

    public T fjern(int indeks) {
        indeksKontroll(indeks, false); // Sjekker at indeksen er gyldig

        T verdi = a[indeks]; // Lagrer verdien som skal fjernes
        antall--; // Reduserer antall elementer

        System.arraycopy(a, indeks + 1, a, indeks, antall - indeks); // Forskyver elementene til venstre
        a[antall] = null; // Setter siste plass til null for å fjerne referansen
        return verdi; // Returnerer den fjernede verdien
    }

    public boolean fjern(T verdi) {
        int indeks = indeksTil(verdi); // Finner indeksen til verdien
        if (indeks == -1) return false; // Returnerer false hvis verdien ikke finnes

        fjern(indeks); // Bruker fjern(int indeks) til å fjerne verdien
        return true; // Bekrefter at fjerningen var vellykket
    }

    public void nullstill() {
        if (a.length > 10) { // Hvis tabellen har mer enn 10 plasser
            a = (T[]) new Object[10]; // Reduserer størrelsen til 10
        } else {
            for (int i = 0; i < antall; i++) {
                a[i] = null; // Nuller ut alle elementene
            }
        }
        antall = 0; // Setter antallet elementer til 0
    }

    private void indeksKontroll(int indeks, boolean leggInn) {
        if (indeks < 0 || (leggInn ? indeks > antall : indeks >= antall)) {
            throw new IndexOutOfBoundsException("Indeks: " + indeks + ", Antall: " + antall);
        }
    }

    public Iterator<T> iterator() {
        return new TabellListeXXIterator(); // Returnerer en ny instans av iteratoren
    }

    private class TabellListeXXIterator implements Iterator<T> {
        private int denne = 0; // Posisjonen til neste element som skal returneres

        public boolean hasNext() {
            return denne < antall; // Sjekker om det er flere elementer igjen
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException("Tomt eller ingen verdier igjen!");
            return a[denne++]; // Returnerer elementet og øker "denne" for å peke på neste
        }
    }
    @Override
    public String toString() {
        if (antall == 0) return "[]";  // Returnerer tomt format hvis listen er tom

        StringBuilder s = new StringBuilder("[");
        s.append(a[0]);                // Legger til første element

        for (int i = 1; i < antall; i++) {
            s.append(", ").append(a[i]);  // Legger til resten med komma-separasjon
        }

        s.append("]");
        return s.toString();  // Returnerer den ferdige strengen
    }

}
