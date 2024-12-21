public class shellSortEks {

    public static void shellSort (int []tabellList ){
        int n =tabellList.length;
        for ( int gap = n/2; gap > 0; gap /=2){
            for (int i = gap; i < n; i++){
                int temp = tabellList[i];
                int j = i; 
                
                while (j >= gap && tabellList [j - gap] > temp){
                    tabellList[j] = tabellList[j-gap];
                    j -= gap;
                }
                tabellList[j] = temp;
                
            }
            
            

        }


    }
    public static void skrivUtArray (int [] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[]tabellListrgs) {
        int [] testList = {8, 14, 16, 19, 17, 9, 3, 4, 1, 15, 5, 18, 13, 11, 12, 2, 6, 20, 7, 10};
        skrivUtArray(testList);

        shellSort(testList);

        skrivUtArray(testList);

    }
}
