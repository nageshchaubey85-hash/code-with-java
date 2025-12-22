import java.util.*;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {2, 8, -9, -4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { //i<=arr.length-2;
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }

        }

    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getmaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getmaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j <= arr.length - i-1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }

        }

    }

}
