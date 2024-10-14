public class Turnering {

    public static int[] finnStørsteOgNestStørste(int[] tall) {
        if (tall.length < 2) {
            throw new IllegalArgumentException("Tabellen må ha minst to elementer.");
        }

        // Opprett en "turnering"
        return turnering(tall, 0, tall.length - 1);
    }

    // Rekursiv metode for å gjennomføre turneringen
    private static int[] turnering(int[] tall, int start, int slutt) {
        if (start == slutt) {
            return new int[]{tall[start], Integer.MIN_VALUE};  // Returner elementet
        }

        // Finn midten og kjør turnering på venstre og høyre halvdel
        int midt = (start + slutt) / 2;
        int[] venstre = turnering(tall, start, midt);
        int[] høyre = turnering(tall, midt + 1, slutt);

        // Sammenlign vinnerne fra venstre og høyre halvdel
        int største;
        int nestStørste;
        if (venstre[0] > høyre[0]) {
            største = venstre[0];
            nestStørste = Math.max(venstre[1], høyre[0]);
        } else {
            største = høyre[0];
            nestStørste = Math.max(høyre[1], venstre[0]);
        }

        return new int[]{største, nestStørste};  // Returner største og nest største
    }

    public static void main(String[] args) {
        int[] tall = {3, 8, 1, 7, 6, 10, 4};
        int[] result = finnStørsteOgNestStørste(tall);
        System.out.println("Største: " + result[0] + ", Nest største: " + result[1]);
    }
}
