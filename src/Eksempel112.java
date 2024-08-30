public class Eksempel112 {

    // Method to find the index of the maximum value in an array
    public static int maks(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabell er tom");
        }

        int m = 0;  // Index of the current maximum value

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) {
                m = i;  // Update index if a larger value is found
            }
        }

        return m;  // Return the index of the largest value
    }
    public static int min(int [] a){
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabell er tom");
        }
        int k = 0;
        for (int j = 1; j < a.length; j++){
            if (a[j] < a[k])
                k = j;
        }
        return k;


    }



    // Main method to test the maks function
    public static void main(String[] args) {
        int[] tallliste = {8,4,	17,	10,6,20,1,11,15,3,18,9,2,7,19};  // Example array

        try {
            int index = maks(tallliste);  // Call the maks method to find the index of the maximum value
            System.out.println("Index of the maximum value: " + index);
            System.out.println("Maximum value: " + tallliste[index]);
        } catch (java.util.NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        try {
            int index = min(tallliste);
            System.out.println("Index of the minste tall er: " + index);
            System.out.println("Minste tallet er: " + tallliste[index]);
        }
        catch (java.util.NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
