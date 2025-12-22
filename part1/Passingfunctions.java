
import java.util.*;

public class Passingfunctions {

    public static void main(String[] args) {
        int[] arr = {12, 21, 23, 65, 45};
        System.out.println(Arrays.toString(arr));
        passingfun(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void passingfun(int[] n) {

        n[0] = 99; // arrays are mutable in java mutable->can be changed the value

    }         // string are not mutable 

}
