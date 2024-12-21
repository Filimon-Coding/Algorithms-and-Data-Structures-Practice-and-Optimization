public class Turneringstrær {
    public static void main(String[] args) {

        int [] tall ={8,6,5,3,2,9};
        /* int [] a = {  9,8,9,8,5,2,9,8,6,5,3};

         */
        int [] a = {2,9,8,6,5,3};
        int begin = 5;

        for (int i = begin; i > 0; i-- ){
            int id = i;
            int left = 2*id;
            int right = 2*id+1;
            if (a[left] > a [right]){
                a [id] = a[left];
            }
            else { a [id] = a[right];

            }


        }

    }

}
