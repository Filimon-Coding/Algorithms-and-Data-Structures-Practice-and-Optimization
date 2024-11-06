package Kap311.Ekstra;

import java.util.Iterator;

public interface ListeX<T> {
    public boolean leggInn(T verdi);           // Nytt element bakerst
    public void leggInn(int indeks, T verdi);  // Nytt element på plass indeks
    public boolean inneholder(T verdi);        // Er verdi i listen?
    public T hent(int indeks);                 // Hent element på plass indeks
    public int indeksTil(T verdi);             // Hvor ligger verdi?
    public T oppdater(int indeks, T verdi);    // Oppdater på plass indeks
    public boolean fjern(T verdi);             // Fjern objektet verdi
    public T fjern(int indeks);                // Fjern elementet på plass indeks
    public int antall();                       // Antallet i listen
    public boolean tom();                      // Er listen tom?
    public void nullstill();                   // Listen nullstilles (og tømmes)
    public Iterator<T> iterator();             // En iterator
}

