package Kap31;

public class TestTabellListe {
    public static void main(String[] args) {
        // Opprett en ny TabellListe med startstørrelse
        TabellListe<String> liste = new TabellListe<>(new String[]{"Per", "Kari", "Ole", null, "Azra", "Perdersen"});

        // Skriv ut antall elementer i listen
        System.out.println("Antall elementer: " + liste.antall());

        // Skriv ut om listen er tom eller ikke
        System.out.println("Er listen tom? " + liste.tom());

        // Skriv ut hele listen som en streng
        System.out.println("Innhold i listen: " + liste);

        // Sjekk om et element finnes i listen
        System.out.println("Inneholder 'Ole'? " + liste.inneholder("Ole"));

        // Finn indeksen til et element
        System.out.println("Indeksen til 'Azra': " + liste.indeksTil("Azra"));

        // Hent elementet på indeks 1
        System.out.println("Element på indeks 1: " + liste.hent(1));
    }
}
