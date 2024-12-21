package EksamenØvelse;

import java.util.Arrays;

public class Eksamen2016 {

    private static void bytt(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static int[] omorganiser(char[] c) {
        Arrays.sort(c); // Kvikksortering - orden n*log(n) i gjennomsnitt

        // Snur tabellen - orden n
        for (int v = 0, h = c.length - 1; v < h; ) {
            bytt(c, v++, h--); // Bytter om
        }

        // Teller små og store bokstaver - orden n i gjennomsnitt
        int småBokstaver = 0;
        int storeBokstaver = 0;

        for (char ch : c) {
            if (ch >= 'a' && ch <= 'z') { // Små bokstaver
                småBokstaver++;
            } else if (ch >= 'A' && ch <= 'Z') { // Store bokstaver
                storeBokstaver++;
            }
        }

        return new int[]{småBokstaver, storeBokstaver};
    }

    public static void main(String[] args) {
        // Oppretter test-tabellen
        char[] test = {'A', 'c', 'a', 'a', 'k', 'K'};

        // Kaller omorganiser og lagrer resultatet
        int[] antallBokstaver = omorganiser(test);

        // Skriver ut resultatet
        System.out.println("Omorganisert tabell: " + Arrays.toString(test));
        System.out.println("Antall små bokstaver: " + antallBokstaver[0]);
        System.out.println("Antall store bokstaver: " + antallBokstaver[1]);
    }
}
