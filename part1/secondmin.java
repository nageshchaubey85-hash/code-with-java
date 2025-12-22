import java.util.*;
 public class secondmin{
 public static int secondMaximum(int[] arr){
        int secmin=arr[1];
        int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            secmin=min;
           min=arr[i];
        }
        else if (arr[i]<secmin && arr[i]!=min){
            secmin=arr[i];
        }
        
    }
    return secmin;

    }
     public static void movezero(int[] arr){
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
            
        }
        while(idx< arr.length){
            arr[idx]=0;
            idx++;
        }

     }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
 }
//   System.out.println("second minimum=" +secondMaximum(arr));
        movezero(arr);
         for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+"\t");
          
      }
 }
 }
    