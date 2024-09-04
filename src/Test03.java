import java.util.NoSuchElementException;

public class Test03 {
    public static int gruppemeldmer(int antall) {
        return antall;
    }

    // Oppgave 1: Method to sort the array and return the maximum value
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tomt");
        }

        // Bubble Sort implementation
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swapping elements if they're in the wrong order
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            // Print array after each pass (optional for debugging)
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }

        // Return the maximum value (last element after sorting)
        return a[a.length - 1];
    }
    public static int sortertSøk (int [] a, int value){

        int stepLength = 2;

        for (int i = 0; i < a.length; i= i + stepLength){
            if (a[i] >= value){
                int begin = i - stepLength;
                int end = i + 1;
                for (int j = begin; j < end; j++){
                    if (a[j] == value){
                        return j;

                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {


    }
}
