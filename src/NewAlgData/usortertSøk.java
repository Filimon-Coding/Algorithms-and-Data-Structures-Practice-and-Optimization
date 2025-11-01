package NewAlgData;

public class usortertSøk {

    public static int UsortertSøk (int [] a , int verdi) {

        for (int i = 0; i < a.length; i++){
            if (verdi == a[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] test1 = {1,2,5,12,123,12,2};
        int serEtter = 123;
        int resultat = UsortertSøk(test1, serEtter);
        System.out.println(resultat);

    }
}
