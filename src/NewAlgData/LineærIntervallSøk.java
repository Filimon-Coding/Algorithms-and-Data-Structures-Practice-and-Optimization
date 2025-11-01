package NewAlgData;

public class LineærIntervallSøk {
    public static int[] lineærIntervallsøk(int[] a, int fraverdi, int tilverdi) {
        if (a.length == 0 || fraverdi > a[a.length - 1])
            return new int[0]; // tom tabell hvis utenfor rekkevidde

        int fra = 0;
        while (a[fra] < fraverdi) fra++; // finn startposisjon

        int til = a.length;
        if (tilverdi <= a[a.length - 1]) {
            til = fra;
            while (a[til] < tilverdi) til++; // finn sluttposisjon
        }

        // returner deltabellen a[fra:til>
        return java.util.Arrays.copyOfRange(a, fra, til);
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 8, 10, 14, 17, 20, 25, 30};
        int [] result = lineærIntervallsøk(a, 8, 20);
        for (int i = 0 ; i < result.length; i ++){
            System.out.print(result[i] + " ");
        }

    }




}
