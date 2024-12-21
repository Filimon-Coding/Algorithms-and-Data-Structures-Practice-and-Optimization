package Kap13;

public class Kvikksortering {
    // Hovedmetode for kvikksortering
    public static void quicksort(int[] a, int venstre, int høyre) {
        if (venstre >= høyre) return; // Basistilfellet for rekursjon
        int pivotIndex = parter(a, venstre, høyre); // Partisjonerer rundt pivot
        quicksort(a, venstre, pivotIndex - 1);  // Sorter venstre del
        quicksort(a, pivotIndex + 1, høyre);    // Sorter høyre del
    }

    // Partisjoneringsmetode
    public static int parter(int[] a, int venstre, int høyre) {
        int pivot = a[høyre];  // Vi velger det siste elementet som pivot
        int i = venstre - 1;   // Indeks for å holde styr på elementer mindre enn pivot
        for (int j = venstre; j < høyre; j++) {
            if (a[j] < pivot) {
                i++;
                bytt(a, i, j);  // Bytter elementer
            }
        }
        bytt(a, i + 1, høyre);  // Setter pivot på riktig plass
        return i + 1;  // Returnerer pivotindeksen
    }

    // Hjelpemetode for å bytte elementer
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Hjelpemetode for å skrive ut tabellen
    public static void skrivUt(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 1, 7, 0, 10};
        System.out.println("Før sortering:");
        skrivUt(a);
        quicksort(a, 0, a.length - 1);  // Sorterer hele tabellen
        System.out.println("Etter sortering:");
        skrivUt(a);
    }
}
