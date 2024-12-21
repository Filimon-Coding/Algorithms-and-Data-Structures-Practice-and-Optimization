package BeholderPac;

import java.util.Iterator;
import java.util.function.Predicate;

public interface Beholder<T> extends Iterable<T> {
    public boolean leggInn(T verdi);    // Legger inn verdi i beholderen
    public boolean inneholder(T verdi); // Sjekker om verdi finnes i beholderen
    public boolean fjern(T verdi);      // Fjerner verdi fra beholderen
    public int antall();                // Returnerer antallet elementer
    public boolean tom();               // Sjekker om beholderen er tom
    public void nullstill();            // Tømmer beholderen
    public Iterator<T> iterator();      // Returnerer en iterator

    default boolean fjernHvis(Predicate<? super T> p) {
        boolean fjernet = false;
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (p.test(it.next())) {
                it.remove();
                fjernet = true;
            }
        }
        return fjernet;
    }
}
