package EksamenØvelse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Eksamen2017Opp2 {

    public static <T> T maks(Iterable<T> s, Comparator<? super T> c){

        if (s == null ||c == null){
            throw new IllegalStateException("Liste er tomt");
        }

        Iterator<T> i = s.iterator();
        if(!i.hasNext()) throw new NoSuchElementException("S er tomt");

        T maks = i.next();
        while (i.hasNext()){
            T verdi = i.next();
            if (c.compare(verdi,maks) > 0) maks = verdi;

        }

        return maks;
    }




    public static int maksFinner (int [] a){
        if (a.length == 0) {
            throw new IllegalStateException("Tabell tomt");
        }
        int maks =a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i]> maks)
                maks = a[i];
        }

     return maks;
    }

    public static void main(String[] args) {
        int [] test = {2,3,5,16,7,2,11};

        int svar = maksFinner(test);
        System.out.println("maks på array : " + svar);

        // Test 2: Generisk maks-metode for Iterable
        Iterable<Integer> testIterable = Arrays.asList(5, 16, 17, 2, 11);
        int svarGenerisk = maks(testIterable, Integer::compare);

        Iterable<String> testIterable2 = Arrays.asList("Per", "Kari", "tor", "zzz");
        String svarGeneriskeString = maks (testIterable2, String::compareTo);

        System.out.println("Maks i iterable: " + svarGenerisk);
        System.out.println("Maks i String " + svarGeneriskeString);
    }


}
