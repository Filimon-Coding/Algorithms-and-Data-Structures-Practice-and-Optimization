package BeholderPac;

public class EnkelBeholder {

    private int [] a;
    private int antall;
    private int antallElementer;


    public EnkelBeholder(int størrelse){
        a = new int [størrelse];
        antall = 0;
        antallElementer =0;
    }
    public boolean leggInn (int verdi){
        if (antall == a.length){
            System.out.println("Beholder er full nå");
            return false;
        }
        a[antall] = verdi;
        antall++;
        antallElementer ++;
        return true;

    }
    public boolean inneholder (int verdi){
        for (int i = 0; i < antall; i++){
            if (a[i] == verdi){
                return true;
            }
        }
        return false;
    }
    public boolean fjern (int verdi){
        for(int i = 0; i < antall; i++){
            if (a[i] == verdi){
                for(int j = i; j < antall -1; j++){
                    a[j] = a[j + 1];
                }
                a[antall -1 ] = 0;
                antall --;
                return true;
            }
        }
        return false;
    }


    public void skrivUt(){
        for ( int i = 0; i < antall; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n "+ "Antall elementer er  " + antallElementer);
    }

    public static void main(String[] args) {
        EnkelBeholder beholder = new EnkelBeholder(3);

        beholder.leggInn(5);
        beholder.leggInn(10);
        beholder.leggInn(15);

        // Test for sjekk om størrelse er fult
        beholder.leggInn(20);


        beholder.skrivUt();

        beholder.fjern(10);

        beholder.skrivUt();

        System.out.println("Inneholder 10 eller ka?   " + beholder.inneholder(10));
        System.out.println("Inneholder 20 eller ka? " + beholder.inneholder(20));

    }





}
