package kap33;

public class EnkeltLenketListe<T> {

    // Definerer Node som en indre klasse
    private static class Node<T> {
        private T verdi;      // verdien til noden
        private Node<T> neste; // referanse til neste node

        // Konstruktør for å lage en ny node med verdi og peker til neste
        private Node(T verdi, Node<T> neste) {
            this.verdi = verdi; // Setter verdien
            this.neste = neste; // Setter referansen til neste node (kan være null)
        }
    }

    private Node<T> hode; // referanse til den første noden i listen (hodet)
    private int antall;   // teller antall noder i listen

    // Konstruktør for å opprette en tom lenket liste
    public EnkeltLenketListe() {
        hode = null;      // Hodet er null, listen er tom i starten
        antall = 0;       // Ingen elementer, så antallet er 0
    }

    // Metode for å legge til en node i starten av listen
    public void leggInnFørst(T verdi) {
        hode = new Node<>(verdi, hode); // Oppretter ny node og setter den som hode
        antall++;                       // Øker antallet elementer i listen
    }

    // Metode for å skrive ut alle elementene i listen
    public void skrivUtListe() {
        Node<T> aktuell = hode;         // Starter fra hodet
        System.out.print("Listen: ");

        // Traverserer gjennom listen og skriver ut hver verdi
        while (aktuell != null) {
            System.out.print(aktuell.verdi + " -> "); // Skriver ut verdien
            aktuell = aktuell.neste;                  // Går videre til neste node
        }

        System.out.println("null"); // Angir slutten av listen
    }

    // Metode for å hente antall elementer i listen
    public int antall() {
        return antall; // Returnerer antallet noder
    }

    // Metode for å sjekke om listen er tom
    public boolean erTom() {
        return hode == null; // Returnerer true hvis hodet er null (listen er tom)
    }

    // Hovedmetode for å teste EnkeltLenketListe
    public static void main(String[] args) {
        // Oppretter en ny enkeltlenket liste av strenger
        EnkeltLenketListe<String> liste = new EnkeltLenketListe<>();

        // Legger til elementer i starten av listen
        liste.leggInnFørst("Node 3");
        liste.leggInnFørst("Node 2");
        liste.leggInnFørst("Node 1");

        // Skriver ut listen
        liste.skrivUtListe();

        // Skriver ut antall elementer i listen
        System.out.println("Antall noder i listen: " + liste.antall());

        // Sjekker om listen er tom
        System.out.println("Er listen tom? " + liste.erTom());
    }
}
