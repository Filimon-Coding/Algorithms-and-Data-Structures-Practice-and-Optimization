public class FlettingEks {

    public static int flett (int [] a , int [] b, int [] c, int m, int n ){ // Endret parameterrekkefølgen

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n){
            if (a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }

        while (i < m){
            c[k++] = a [i++];
        }

        while (j < n){
            c[k++] = b[j++];
        }
        return k;
    }

    public static void skrivUtArray (int [] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n ------------");
    }

    public static void main(String[] args) {
        int [] a = {2, 4, 6, 8, 10, 12, 14};
        int [] b = {2, 4, 6};
        int [] c = new int [a.length + b.length];

        // Før fletting
        System.out.println("Tabell før fletting:");
        skrivUtArray(c);

        // Korrigert kall til flett-metoden
        flett(a, b, c, a.length, b.length); // Riktig rekkefølge: a.length først, deretter b.length

        // Etter fletting
        System.out.println("Flettet tabell:");
        skrivUtArray(c);
    }
}
