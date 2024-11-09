package kap33;

public class EnkeltLenketListeX<T> {

    // Indre klasse som representerer en node i listen
    private static class Node<T> {
        private T verdi;        // Verdien som lagres i noden
        private Node<T> neste;  // Referanse til neste node i listen

        // Konstruktør som tar inn en verdi og en referanse til neste node
        private Node(T verdi, Node<T> neste) {
            this.verdi = verdi;   // Setter verdien i noden
            this.neste = neste;   // Setter referansen til neste node
        }
    }

    private Node<T> hode;  // Referanse til den første noden i listen (hodet)
    private int antall;    // Antall elementer i listen

    // Konstruktør som oppretter en tom liste
    public EnkeltLenketListeX() {
        hode = null;   // Starter med en tom liste, så hodet er null
        antall = 0;    // Ingen elementer i listen, så antallet er 0
    }

    // Metode for å legge til et nytt element først i listen
    public void leggInnFørst(T verdi) {
        hode = new Node<>(verdi, hode); // Oppretter en ny node som blir det nye hodet
        antall++;                       // Øker antallet elementer i listen
    }

    // Metode for å iterere gjennom listen og skrive ut alle elementene
    public void itererGjennomListe() {
        Node<T> aktuell = hode;  // Starter fra hodet
        System.out.print("Listen: ");

        // Går gjennom listen til slutten (når aktuell er null)
        while (aktuell != null) {
            System.out.print(aktuell.verdi + " -> "); // Skriver ut verdien i noden
            aktuell = aktuell.neste;                  // Flytter til neste node
        }

        System.out.println("null"); // Indikerer slutten av listen
    }

    // Metode for å søke etter en verdi i listen og returnere indeksen
    public int finnIndeks(T verdi) {
        Node<T> aktuell = hode; // Starter fra hodet
        int indeks = 0;         // Indeks for å holde posisjonen i listen

        // Traverserer listen til slutten eller til vi finner verdien
        while (aktuell != null) {
            if (aktuell.verdi.equals(verdi)) { // Sjekker om verdien finnes i noden
                return indeks; // Returnerer indeksen hvis verdien er funnet
            }
            aktuell = aktuell.neste; // Går videre til neste node
            indeks++; // Øker indeksen
        }

        return -1; // Returnerer -1 hvis verdien ikke finnes i listen
    }

    // Metode for å sjekke om listen er tom
    public boolean erTom() {
        return hode == null; // Returnerer true hvis hode er null (listen er tom)
    }

    // Metode for å hente antall elementer i listen
    public int hentAntall() {
        return antall; // Returnerer antallet elementer
    }

    // Hovedmetode for å teste funksjonaliteten til EnkeltLenketListe
    public static void main(String[] args) {
        // Oppretter en ny lenket liste av strenger
        EnkeltLenketListeX<String> liste = new EnkeltLenketListeX<>();

        // Legger til elementer i listen
        liste.leggInnFørst("Node 5");
        liste.leggInnFørst("Node 4");
        liste.leggInnFørst("Node 3");
        liste.leggInnFørst("Node 2");
        liste.leggInnFørst("Node 1");




        // Skriver ut listen
        // 
        System.out.println("Itererer gjennom listen:");
        liste.itererGjennomListe();

        // Søker etter en verdi og skriver ut indeksen
        String søkeverdi = "Node 3";
        int indeks = liste.finnIndeks(søkeverdi);
        System.out.println("Indeks til \"" + søkeverdi + "\": " + indeks);

        // Skriver ut om listen er tom eller ikke
        System.out.println("Er listen tom? " + liste.erTom());

        // Skriver ut antall elementer i listen
        System.out.println("Antall elementer i listen: " + liste.hentAntall());
    }
}
