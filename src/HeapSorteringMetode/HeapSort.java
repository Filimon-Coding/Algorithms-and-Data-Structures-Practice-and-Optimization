package HeapSorteringMetode;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int values [] = {-99, 5, 8 , 3, 1};


    }

    static void heapsort(int [] values ){

        System.out.println(" Array før heapify  metode " + Arrays.toString(values));
        heapify(values);
        System.out.println(" Array etter heapify metode " + Arrays.toString(values));
        for (int i = 1; i < values.length-1; i++){
            int first = 1;
            int last = values.length-i;

            int tmp = values[first];
            values[first] = values[last];
            values[last] = tmp;

            int current = first;
            int left_child = current*2;
            int right_child = current*2+1;
            while (left_child < last){


            }


        }



    }

    static void heapify(int [] values ) {
        for (int i = 1; i < values.length; i++){

            int current  = i;
            int parent = i/2;

            while (parent > 0 && values [parent] > values[current]){
                System.out.println(" Bytter " + values[current] +   " med " +  values[parent]);
                int temp = values[parent];
                values[parent] = values[current];
                values[current] = temp;
                current = parent;
                parent = current/2;

            }

        }

    }

}
