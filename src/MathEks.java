import java.util.Arrays;

public class MathEks {

    public static boolean finnMod (int a, int b) {

        if (a % b != 0){
            return true;

        }
        return false;
    }

    public static int [] finnSvar (int a, int b) {
     int q;
      int  r = a % b;
      if (r == 0){
           q = a/b;

      }else {
          int tempA = a-r;
          q = tempA/b;
      }

        return new int [] {q,r};

    }

    public static void main(String[] args) {

        boolean svar  = finnMod(155, 13);

        System.out.println("Det finnes rest :  " + svar);
        int [] tallSvar = finnSvar(13, 3);
        System.out.println("Det er quotient og rest: " + Arrays.toString(tallSvar));
        System.out.println("Det er quention " + tallSvar + "Det er rest :  " + tallSvar );

    }
}
