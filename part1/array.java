import java.util.*;
public class array {
    public static void main(String args[]){
        //1-D ARRAYS//
       // first method//
    //     int marks[]=new int[3];
    //     marks[0]=97;
    //     marks[1]=98;
    //     marks[2]=90;
    //     //second method //
    //     int max[]={93,84,67,75};
    //     for(int i=0;i<3;i++){
    //         System.out.println(marks[i]);
    //         System.out.println(max[i]);
    //   }
    //   Scanner sc=new Scanner(System.in);
    //   int size=sc.nextInt();
    //   int number[]=new int[size];
    //   for(int i=0;i<size;i++){
    //     number[i]=sc.nextInt();
    //     }
    //   for(int i=0;i<size;i++){
    //     System.out.println(number[i]);

    //   }
    //    Scanner sc1=new Scanner(System.in);
    //   int size1=sc1.nextInt();
    //   int array[]=new int[size1];
    //   for(int i=0;i<size1;i++){
    //     array[i]=sc1.nextInt();
    //     }
    //     //output//
    //      int x=sc1.nextInt();
    //   for(int i=0;i<size1;i++){
    //      if(array[i]==x){
    //          System.out.println("x found at index:"+i);
    //         //  System.out.println(array[i]);
    //     }

    //    }
       Scanner sc2=new Scanner(System.in);
       int rows=sc2.nextInt();
       int col=sc2.nextInt();
       int[][] arrays=new int[rows][col];
       //input rows//
       for (int i = 0; i < rows; i++) {
        //columns//
         for (int j = 0; j< col; j++) {
            arrays[i][j]=sc2.nextInt();
         }
           
       }
       int x=sc2.nextInt();
        for (int i = 0; i < rows; i++) {
         for (int j = 0; j< col; j++) {
            if(arrays[i][j]==x){
            // System.out.print(arrays[i][j]+" ");
            System.out.println(" index are ("+ i+ ", " + j+")");
            }
            // System.out.println();

        }
        }
     }
}