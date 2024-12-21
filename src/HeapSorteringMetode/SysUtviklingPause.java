package HeapSorteringMetode;

import java.util.Scanner;

public class SysUtviklingPause {

    public static int tilfeldigTall (){
        // Gjør om til klasse slik at det ser bedre ut


        return 0;
    }
  



    public static void main(String[] args) {
        for (int j = 0; j <5;j++) {
            int vinTeller = 0;
            int tapTeller = 0;

            int max = 3;
            int min = 1;
            int range = max - min + 1;
            int rand = 0;

            for (int i = 0; i < max; i++) {
                rand = (int) (Math.random() * range) + min;

            }


            System.out.println(rand);

            Scanner innput = new Scanner(System.in);
            System.out.println(" 1 = stein 2 = saks 3 = papir" +
                    "\n" + "Velg 1, 2 , 3 ");

            int brukerInnput = innput.nextInt();

            String elementVerdiPC = "";
            if (rand == 1) {
                elementVerdiPC = "stein";
            } else if (rand == 2) {
                elementVerdiPC = "saks";

            } else if (rand == 3) {
                elementVerdiPC = "papir";

            }
            String elementVerdiMennekse = "";
            if (brukerInnput == 1) {
                elementVerdiMennekse = "stein";
            } else if (brukerInnput == 2) {
                elementVerdiMennekse = "saks";

            } else if (brukerInnput == 3) {
                elementVerdiMennekse = "papir";

            }


            // Skriv ut valgene
            System.out.println("PC valgte: " + elementVerdiPC);
            System.out.println("Du valgte: " + elementVerdiMennekse);

            // Sjekk resultatet
            if (elementVerdiPC.equals(elementVerdiMennekse)) {
                System.out.println("Det ble uavgjort!");
            } else if (
                    (elementVerdiPC.equals("stein") && elementVerdiMennekse.equals("saks")) ||
                            (elementVerdiPC.equals("saks") && elementVerdiMennekse.equals("papir")) ||
                            (elementVerdiPC.equals("papir") && elementVerdiMennekse.equals("stein"))

            ) {
                tapTeller ++;
                System.out.println("PC vinner!");
                System.out.println("Din totalt tap runder er " + tapTeller);




            } else {
                vinTeller ++;
                System.out.println("Du vinner!");
                System.out.println("Din totalt vin runder er " + vinTeller);

            }

        }










    }
}
