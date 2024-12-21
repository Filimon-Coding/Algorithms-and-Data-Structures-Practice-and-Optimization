package AiOppgaveSamlingen;

public class Oppgave2 {
    public static int [] maksOgMin (int [] a){
        int maks = 0;
        int  min = 0;
        int maksIndeks = 0;
        int minIndeks = 0;
        for (int i = 0; i <a.length; i++){
            if (maks < a[i]){
                maks = a[i];
                maksIndeks = i;
            }
            if (a[i] < min){
                min = a[i];
                minIndeks  = i;
            }



        }


        return new int[] {maksIndeks, minIndeks} ;
    }

    public static void main(String[] args) {
        int [] tabellList = {25,32,3,4,5,2,39,4,23,4,3};
        int [] svar = maksOgMin(tabellList);
        System.out.println(svar[0] + " " + svar[1]);
    }
}
