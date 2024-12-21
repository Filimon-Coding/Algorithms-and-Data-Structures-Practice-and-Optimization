package EksamenØvelse;

public class Eksamen2017Opp1 {

    public static int [] frekvensFordeling (int [] a){


        if (a.length == 0){
            throw new  IllegalStateException("Tabell er tomt");
        }
        int antall = 0;
        int temp = 0;

        for (int i = 0; i < a.length; i++){

            for (int j = i; j < i; j++){
                if (a[i] == a[j]){
                    temp = i;
                    antall ++;
                }
            }

        }

        return new int [] {temp, antall};
    }

    public static void main(String[] args) {
        int [] test = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

        frekvensFordeling(test);

        System.out.println(frekvensFordeling(test));
    }


}
