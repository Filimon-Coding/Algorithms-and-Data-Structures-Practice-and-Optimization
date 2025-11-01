package NewAlgData;

public class byttingRotatasjon {
    // Bytter a[i] og a[j]
    public static void bytt(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // Snur delintervallet a[v..h] (lukket intervall)
    public static void snu(char[] a, int v, int h) {
        while (v < h) {
            bytt(a, v, h);
            v++; h--;
        }
    }

    // Roterer d plasser mot høyre (negativ d = venstre)
    public static void rotasjon(char[] a, int d) {
        int n = a.length;
        if (n < 2) return;          // 0/1 element: ingenting å gjøre

        d %= n;                     // gjør d mindre enn n
        if (d < 0) d += n;          // håndter venstre (negativ) ved å gjøre om til høyre

        // 1) snu hele
        snu(a, 0, n - 1);
        // 2) snu første d
        snu(a, 0, d - 1);
        // 3) snu fra d til slutten
        snu(a, d, n - 1);
    }

    public static void main(String[] args) {
        char[] a = "ABCDEFGHIJKLMNOP".toCharArray(); // 16 elementer
        rotasjon(a, 10);  // 10 til høyre
        System.out.println(java.util.Arrays.toString(a));
        // [G, H, I, J, K, L, M, N, O, P, A, B, C, D, E, F]
    }

}
