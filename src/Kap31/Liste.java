package Kap31;

public interface Liste<T> {
    int antall();
    boolean tom();
    T hent(int indeks);
    int indeksTil(T verdi);
    boolean inneholder(T verdi);
}
