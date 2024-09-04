public class Test04 {

    public static void main(String[] args) {
        // Testing the gruppemeldmer method
        int antallGruppemedlmer = 1;
        System.out.println("Antall gruppemedlemmer: " + Test03.gruppemeldmer(antallGruppemedlmer));

        // Testing the maks method with sorting
        int[] listTest = {6, 2, 7, 9, 6, 1, 6, 7, 3, 2};
        int maks = Test03.maks(listTest);
        System.out.println("Storst nummer er " + maks);  // Should print "Storst nummer er 9"
        int unsortedSøk = Test03.sortertSøk(listTest,1);
        System.out.println("Value vi ser etter er " + unsortedSøk);

        // Print the sorted array
        System.out.print("Sortert liste: ");
        for (int num : listTest) {
            System.out.print(num + " ");


        }
        System.out.println();
    }
}
