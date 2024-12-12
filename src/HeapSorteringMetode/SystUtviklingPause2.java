package HeapSorteringMetode;

import java.util.Scanner;



public class SystUtviklingPause2 {

    public static int gjetter(int [] a, int mottat){






        return 0;
    }public static int gjetterx(int [] a, int mottat){






        return 0;
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {


        int[] a = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81,
                80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61,
                60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41,
                40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21,
                20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Tast inn tallet du tenker på det");
        System.out.println("Tast inn tallet du tenker på det");
        System.out.println("Tast inn tallet du tenker på det");
        System.out.println("Tast inn tallet du tenker på det");


        Scanner inputScan = new Scanner(System.in);
       int brukerInnput = inputScan.nextInt();

       Scanner inputAlderScan = new Scanner(System.in);
       int inputAlder = inputAlderScan.nextInt();

        System.out.println("Før sortering:");


        boolean byttet;

        do {
            byttet = false;


            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // Bytt metode
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    byttet = true;

                }
                System.out.print(" " + a[i]);
            }
            System.out.println(" ");
        }
            while(byttet);
                System.out.println("Etter sortering:");
                printArray(a);

                int brukerInnputPlus10= brukerInnput +10;
                int alder = 2024 - inputAlder;
               // int brukeInnputplus10Ganges = brukerInnputPlus10 * alder ;
                int endeligSvar = (brukerInnputPlus10 - 10);
                int endligsvarForAlder = endeligSvar + alder;
                /*
        int endeligSvar = (brukerInnputPlus10 - 10);
        int endligsvarForAlder = endeligSvar + alder;

                 */

        System.out.println("Din alder samletmed tallet i hodet er : " + endligsvarForAlder);













    }
}
