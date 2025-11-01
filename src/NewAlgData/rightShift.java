package NewAlgData;

public class rightShift {


    public static void rightshift(int[] a, int d) {
        if (d < 0) throw new IllegalArgumentException("Negativ parameter!");
        if (a.length <= 1) return;  // Hvis tabellen har 0 eller 1 element, gjør ingenting

        d %= a.length;  // Hvis d er større enn tabellens lengde, reduser den (f.eks. 13 % 10 = 3)

        // Flytt alle verdiene d plasser mot høyre
        for (int i = a.length - 1; i >= d; i--) {
            a[i] = a[i - d];
        }

        // Fyll inn de første d plassene med verdien som opprinnelig lå først
        for (int i = 0; i < d; i++) {
            a[i] = a[0];
        }
    }
    public static void skrivUtTabell(int[] a) {
        System.out.print("["); // start med klammeparentes
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]); // skriv ut verdien
            if (i < a.length - 1) System.out.print(", "); // komma mellom tallene
        }
        System.out.println("]"); // avslutt linjen
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


        // Før forskyvning
        System.out.print("Før forskyvning: ");
        skrivUtTabell(a);

        // Utfør høyreforskyvning med 2 steg
        rightshift(a, 2);

        // Etter forskyvning
        System.out.print("Etter forskyvning: ");
        skrivUtTabell(a);

    }

}

/*
>> = fortegnsbevarende → fyller inn den opprinnelige venstre biten (1 hvis tallet var negativt).

>>> = nullfyllende → fyller alltid med 0.
 */
