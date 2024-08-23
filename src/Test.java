public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int vals [] = {16, 3, 8,19, 22,7,26}; // n = 7
        int størst = vals[0]; // 2
        for (int i = 1; i < vals.length; i++){ // 1 + n + (n-1)
            int verdi = vals[i]; // 2 * (n-1)

            if (verdi > størst){ // 1 * (n-1)
                størst = vals[i]; // x
            }
            /*
            Ved bruk v telloperasjon fant vi at 37 tell med kun 7 antall indeks gitt
            Ved regne ut : 5n -1 + x
            så tester vi : 5(7) - 1+3=
            Så vet at x er lik 3
            Svaret blir 37 som vi klarte å fine ved tellinga

             */

        }
        System.out.println("Størst tall i array er " + størst);
/*
        boolean p = 3 >2;
        boolean q = 1 > 2;
        boolean r = (q || p) ^ q;

        System.out.println(r);
        System.out.println(q);

 */
        /*
        int a = 10, b = 20, c= 30;
        if ((a > b) || (c>b)){
            System.out.println("Det stemmer");

        }
        else {
            System.out.println("Det stemmer ikke");
        }


        int a = 10, b = 1;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

         */

    }
}
