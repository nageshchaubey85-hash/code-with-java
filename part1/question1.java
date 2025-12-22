
import java.util.*;

public class question1 {

    //MAXIMUM OF TWO ARRAYS
    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }

    //SECOND MAXIMUM ELEMENTS
    public static int secondMaximum(int[] arr) {
        int secmax = arr[1];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }

        }
        return secmax;

    }

    //REVERSE ARRAY
    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    //SUM ELEMENTS OF ARRAYS
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int occurence(int[] arr, int data) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {

        //static array declaration
        //    int arr[]={2,3,5,78,98};
        // dyanamic arry decllaration// 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Element in array:");
        int largest = max(arr);
        System.out.println(largest);
        System.out.println("Reverse of Array:");
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println("Sum of element of Array:");
        int sumArray = sumArray(arr);
        System.out.println("sum of array=" + sumArray);

        System.out.println("enter the data to be searched: ");
        int m = sc.nextInt();
        int count = occurence(arr, m);
        System.out.println("occurence=" + count);

        System.out.println("second maximum=" + secondMaximum(arr));

    }
}
