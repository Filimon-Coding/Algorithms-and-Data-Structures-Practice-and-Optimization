public class Test05 {

    public static int  lineaertSok (int [] tabell, int verdi) {
        if (tabell.length < 0){
            System.out.println("Tabbell er tomt! ");

        } else if (tabell.length == 1) {
            System.out.println("Tabell er inneholder 1 elemt og den er " + tabell[0]);

        }
        {

        }
        for (int i = 0; i < tabell.length; i++){
            if (tabell[i] == verdi){
                return i;
            }

        }

        return -1;
    }
    public static void display(){


    }

    public static void main(String[] args) {
        int[] tabell = {0};
        System.out.println(lineaertSok(tabell, 22));


    }
}