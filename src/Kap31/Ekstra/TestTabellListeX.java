package Kap31.Ekstra;

public class TestTabellListeX {
    public static void main(String[] args) {
        // Oppretter en ny TabellListeX og legger inn noen elementer
        TabellListeX<String> liste = new TabellListeX<>(new String[]{"Dog", "Cat", "Horse", null, "Cow"});

        // Tester antall elementer i listen
        System.out.println("Antall elementer: " + liste.antall());

        // Tester om listen er tom
        System.out.println("Er listen tom? " + liste.tom());

        // Skriver ut innholdet i listen
        System.out.println("Innhold i listen: " + liste);

        // Tester om en bestemt verdi er i listen
        System.out.println("Inneholder 'Cat'? " + liste.inneholder("Cat"));

        // Finner indeksen til et element
        System.out.println("Indeksen til 'Horse': " + liste.indeksTil("Horse"));

        // Henter et element på en spesifikk indeks
        System.out.println("Element på indeks 1: " + liste.hent(1));

        // Legger til et nytt element på slutten av listen
        liste.leggInn("Monkey");
        System.out.println("Etter å ha lagt til 'Nora': " + liste);

        // Legger til et element på en spesifikk indeks
        liste.leggInn(2, "Lars");
        System.out.println("Etter å ha lagt til 'Lars' på indeks 2: " + liste);

        // Oppdaterer et element på en spesifikk indeks
        liste.oppdater(2, "Lasse");
        System.out.println("Etter å ha oppdatert indeks 2 til 'Lasse': " + liste);

        // Fjerner et element på en spesifikk indeks
        liste.fjern(1);
        System.out.println("Etter å ha fjernet elementet på indeks 1: " + liste);

        // Fjerner en bestemt verdi
        liste.fjern("Horse");
        System.out.println("Etter å ha fjernet 'Horse': " + liste);

        // Nullstiller listen
        liste.nullstill();
        System.out.println("Etter å ha nullstilt listen: " + liste);
    }
}
