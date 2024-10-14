public class BinaertSokA {


    public static int binaertSok (int [] tabell, int verdi) {
        if (tabell.length <= 0){
            System.out.println("Tabell er tomt");
        }
        int venstre = 0;
        int høyre = tabell.length-1;

        while (venstre <= høyre){
            int midtIndeks = venstre + ((høyre - venstre)/2);

            if (tabell[midtIndeks] == verdi){
                return midtIndeks;
            } else if (tabell[midtIndeks] < verdi) {
                venstre = midtIndeks +1;

            }
            else {
                høyre = midtIndeks -1;
            }
        }



        return -1;

    }

    public static void main(String[] args) {
        int[] tabell = {2, 3, 5, 7, 8, 9};
        System.out.println(binaertSok(tabell, 6 ));
    }
}
