
public class sortedarray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6,7,8,9};
        System.out.println(sorted(arr,0));

         System.out.println(linearsearch(arr,1,0));

    }

    public static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return ((arr[index] < arr[index + 1]) && (sorted(arr, index + 1)));

    }

    public static boolean linearsearch(int [] arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
         return ((arr[index] == target) || linearsearch(arr ,target ,index+1));    
    }
}
