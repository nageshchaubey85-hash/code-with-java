
import java.util.*;

public class question {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // swaparry(arr,  0,  4);
        // System.out.println(Arrays.toString(arr));
        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);

        System.out.println(Arrays.toString(arr));

        max(arr);

        maxrange(arr, 1, 3);

    }

    public static void swaparry(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //maximum of array//
    public static void max(int[] arr) {

        //input in arrays//
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[3];
        for (int i = 0; i < 4; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //maximum range element//
    public static void maxrange(int[] arr, int start, int end) {

        //input//
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //swap//
            swaparry(arr, start, end);
            start++;
            end--;

        }
    }
}
