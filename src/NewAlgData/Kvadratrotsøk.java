package NewAlgData;

public class Kvadratrotsøk {

    public static int kvardatSøk (int [] a, int verdi){
        int n = a.length;
        int steg = (int) Math.sqrt(n); // hopplengde = kvaratroten av tabellen lengde
        int i =0;

        // hopp fremover så lengde neste Hopp er mindre søkeverdien
        while (i < n && a[i] < verdi){
            i += steg;
        }
        // gå tilbake steg slik at vi finner riktige område til verdien vi ser etter
        int start = Math.max(0,i-steg);

        for (int j = start; j < Math.min(i,n); j++){
            if (a[j] == verdi)
                return j;
        }
        return -1;

        // Effekte fra linærsøk O(n) til 0(√n) (kvardat av n) : Det er mye raskere.


    }
}
