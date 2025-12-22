import java.util.*;
public class one{
    public static void main(String[] args) {
        //  int[] arr={4,3,1,2,2,5,6,6};
          int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(dupli(arr));
        System.out.println(Arrays.toString(arr));
        
    }
public static int dupli(int[]arr){
    int i=0;
    while(i<arr.length){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
    }
    for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]!=idx+1){
            //  return new int[] {arr[idx]};
            return arr[idx];
            }
            
        }
        // return new int[] {-1,-1};
        return -1;

}
public static void swap(int[] arr,int first,int second) {
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}