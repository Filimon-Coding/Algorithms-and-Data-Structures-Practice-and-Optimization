package Kap311;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class TabellListe<T> implements Liste<T> {
    private T[] a;          // en tabell for å lagre elementene
    private int antall;     // antall elementer i listen

    // Konstruktør som tar inn en spesifikk størrelse
    @SuppressWarnings("unchecked")
    public TabellListe(int størrelse) {
        a = (T[]) new Object[størrelse];  // oppretter en ny tabell av gitt størrelse
        antall = 0;                       // foreløpig ingen verdier
    }

    // Standardkonstruktør med standard startstørrelse (10)
    public TabellListe() {
        this(10);  // kaller den andre konstruktøren med startstørrelse 10
    }

    // Konstruktør som lager en TabellListe fra en gitt tabell
    public TabellListe(T[] b) {
        this(b.length);  // kaller konstruktøren med b-tabellens lengde som størrelse
        for (T verdi : b) {
            if (verdi != null) a[antall++] = verdi;  // hopper over null-verdier
        }
    }

    // Returnerer antall elementer i listen
    public int antall() {
        return antall;
    }

    // Sjekker om listen er tom
    public boolean tom() {
        return antall == 0;
    }

    // Henter elementet på en spesifikk indeks uten å fjerne det
    public T hent(int indeks) {
        indeksKontroll(indeks, false); // false fordi indeksen = antall er ulovlig
        return a[indeks];
    }

    // Finner indeksen til første forekomst av en gitt verdi
    public int indeksTil(T verdi) {
        for (int i = 0; i < antall; i++) {
            if (a[i].equals(verdi)) return i;  // returnerer første forekomst
        }
        return -1;  // returnerer -1 hvis verdien ikke finnes
    }

    // Sjekker om en gitt verdi er i listen
    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;  // sjekker om indeksen er gyldig
    }

    // Returnerer en representasjon av listen som en streng
    public String toString() {
        if (antall == 0) return "[]";  // returnerer tom liste-formatet
        StringBuilder s = new StringBuilder("[");
        s.append(a[0]);                // legger til første element
        for (int i = 1; i < antall; i++) {
            s.append(", ").append(a[i]);  // legger til resten med komma-separasjon
        }
        s.append("]");
        return s.toString();  // returnerer den ferdige strengen
    }



    // Hjelpemetode for å kontrollere indekser
    private void indeksKontroll(int indeks, boolean leggInn) {
        if (indeks < 0 || (leggInn ? indeks > antall : indeks >= antall)) {
            throw new IndexOutOfBoundsException("Indeks: " + indeks + ", Antall: " + antall);
        }
    }

    // Iterator-implementasjon for å bla gjennom elementene
    public Iterator<T> iterator() {
        return new TabellListeIterator();
    }

    // Indre iterator-klasse for å håndtere iterering
    private class TabellListeIterator implements Iterator<T> {
        private int denne = 0;  // posisjonen til neste element
        public boolean hasNext() {
            return denne < antall;  // sjekker om det er flere elementer igjen
        }
        public T next() {
            if (!hasNext()) throw new NoSuchElementException("Tomt eller ingen verdier igjen!");
            return a[denne++];  // returnerer elementet og flytter posisjonen fremover
        }
    }
}
