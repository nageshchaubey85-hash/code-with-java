import java.util.*;
public class search2D{
    public static void main(String[] args) {
        int[][]arr={
            {23,4,1},
            {18,12,3,9},
            {78,52,89,32},
            {15,13}
        };
        int target=32;
        int ans[]=search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        // System.out.println(Integer.MIN_VALUE);
        
    }
    public static int[] search(int [][]arr,int target){
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
    }
    return new int[]{-1,-1};

}
public static int max(int [][]arr){
    int max=Integer.MIN_VALUE;
        // for (int[] arr1 : arr) {
        //     for(int element:arr1){
        //         if (element > max) {
        //             max=element;
        //          }
        //       }
        //    }
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                if (arr1[col] > max) {
                    max = arr1[col];
                }
            }
            /*
            for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] > max) {
            max=arr[row][col];
            }
            }
             */
        }
    
 return max;
}
}
