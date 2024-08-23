public class Test02 {
    public static void main(String[] args) {
        int[] a = {3, 8, 2, 7, 5, 1};  // Example array
        int result = maks(a, 1, 4);    // Call the maks method
        System.out.println("The index of the maximum value is: " + result);
    }

    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
}
