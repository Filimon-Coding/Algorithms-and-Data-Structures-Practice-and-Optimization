import java.io.FilterOutputStream;

public class arbeidsMengdenAlgoData {

    public static void skriv2potens (int n){

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }

    public static boolean erSortert (int [] a) {

        for (int i = 1; i < a.length; i++){
            if (a[i-1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int [] tabell = {2,5,21,8,9};
        boolean svar = erSortert(tabell);
        System.out.println(svar);


        int a = 3;
        skriv2potens(a);
    }

}

