
import java.util.*;

public class linearsearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int target = sc.nextInt();
        System.out.println("Enter the Array:");
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int ans = linearsearch(number, target);
        System.out.println(ans);

        int ans1 = linearsearch2(number, target);
        System.out.println(ans1);

        boolean ans2 = linearsearch3(number, target);
        System.out.println(ans2);
    }

    //search in the array:return the index of item found
    //oterwise return-1 for not found 
    
    public static int linearsearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // int element=arr[i];
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearsearch2(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    public static boolean linearsearch3(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
