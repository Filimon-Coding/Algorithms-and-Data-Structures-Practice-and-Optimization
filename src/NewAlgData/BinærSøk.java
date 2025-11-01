package NewAlgData;

public class BinærSøk {

    public static int binærsøk (int [] a, int fra , int til, int verdi){
        int v = fra;
        int h = til -1;
        int m = (v+h/2);


        while (v <= h){

            int midtverdi = a[m];

            if (verdi > midtverdi){
                v = m+1;
            }
            else if (verdi < midtverdi)  {
                h = m -1;
            }else {
                return m;
            }
        }
                return -(v +1); // ikke funnet  så v er realtivt innsettingspunkt
    }

    public static int binærsøk (int [] a, int verdi){
        return binærsøk(a, 0,a.length, verdi);  // utnytter forrige metode men her søker gjennom hele tabellen
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 8, 10, 14, 17, 20, 25, 30};
        int resulatet = binærsøk(a, 2,6,14);
        System.out.println(resulatet);

    }
}
