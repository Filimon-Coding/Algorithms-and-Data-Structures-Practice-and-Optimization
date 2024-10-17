import java.util.Arrays;

public class BinaertSokA {


    public static int binaertSok (int [] tabell, int verdi) {
        if (tabell.length <= 0){
            System.out.println("Tabell er tomt");
        }
        int venstre = 0;
        int høyre = tabell.length-1;

        while (venstre <= høyre){
            int midtIndeks = venstre + ((høyre - venstre)/2);

            if (tabell[midtIndeks] == verdi){
                return midtIndeks;
            } else if (tabell[midtIndeks] < verdi) {
                venstre = midtIndeks +1;

            }
            else {
                høyre = midtIndeks -1;
            }
        }



        return -1;

    }

    public static int tverrrsum(int n ){




        if (n < 10){
            return n;
        }
        else {
            return tverrrsum(n / 10 )+(n % 10);
        }
    }

    public static int rekrusikBiSøk( int [] a, int fra, int til, int verdi){
        if (fra > til) {
            return -1; // Dersom starten er større enn slutten
        }

        int midt = (fra + til) / 2;
        if (a[midt] == verdi) {
            return midt;
        } else if (a[midt] > verdi) {
            return rekrusikBiSøk(a, fra, midt - 1, verdi);
        } else {
            return rekrusikBiSøk(a, midt + 1, til, verdi);
        }
    }

    public static int fibonacci (int n){
        if ( n == 0){
            return n;
        }
        if ( n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }






    public static void main(String[] args) {


        System.out.println("-------------------------");
        int b = 5;
        System.out.println(fibonacci(b));



        System.out.println("-------------------------");

        int[] tabell = {12,2, 11, 13, 5, 6};
        Arrays.sort(tabell);

        int indeks = rekrusikBiSøk(tabell,0, tabell.length- 1, 6);
        System.out.println(" " + indeks);



        int a = 7295;
        int sum = tverrrsum(a);
        System.out.println(" " + sum);

        System.out.println("-------------------------");



    }
}
