package HeapSorteringMetode;

import java.util.Scanner;

public class SystUtviklingPause2 {

    public static int gjetter(int [] a, int mottat){






        return 0;
    }


    public static void main(String[] args) {

        int [] a = {5,4,3,2,1};
        System.out.println("Tast inn tallet du tenker på det");

        Scanner inputScan = new Scanner(System.in);
        int brukerInnput = inputScan.nextInt();

        for (int i = 0; i < a.length; i++){
            if (a[i] > a [i+1]){
                // Bytt metode
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;

            }
            System.out.print(" " + i);
            System.out.println();
        }




    }
}
