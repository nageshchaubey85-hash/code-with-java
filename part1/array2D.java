import java.util.*;
public class array2D{
    public static void main(String[] args) {

//           int[][] arr= new int[3][];
/*          int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
           }; */

           //INPUT//

            Scanner sc=new Scanner(System.in);
           int[][] arr= new int[3][2];
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                arr1[col] = sc.nextInt();
            }
/*             for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
            arr[row][col]=sc.nextInt();
            }       */
            //OUTPUT//
            /*
            for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col]+" ");
            } 
            System.out.println("");
            }
             */
            System.out.println(Arrays.toString(arr1));
        }


           // COLUMN NOT SIZE REQUIRED//

           int[][]arr1={
            {1,2,3},
            {4,5},
            {1,2,3,6,4,5}
           };
        for (int[] arr11 : arr1) {
            for (int col = 0; col < arr11.length; col++) {
                System.out.print(arr11[col] + " ");
            }
            System.out.println("");
        }       
    }
}
    

