package NewAlgData;

public class Maks {

    public static int maks (int[] a){
        int m = 0;
        int verdi= 0;
        int maksVerdi = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > maksVerdi){
                maksVerdi = a[i];
                m = i;
                verdi = a[i];

            }
        }
        return verdi;
    }

    public static void bytt (int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        int [] test = {1,2,7,8,12,2,4,1};

        System.out.println(maks(test));

    }
}
