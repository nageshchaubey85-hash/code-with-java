public class binaryRotatedsearch{
    public static void main(String[] args) {
        int arr [] = {5,6,1,8,9,1,2,3,4};
        System.out.println(BSR(arr,8,0,arr.length-1));
    }
    public static int BSR(int []arr,int target,int s,int e){
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&&target<=arr[m]){
              return  BSR(arr,target,s,m-1);
            }
            else{
                 return  BSR(arr,target,m+1,e);
            }
        }
        if (target>=arr[m]&&target<=arr[e]) {
            return  BSR(arr,target,m+1,e);  
        }
        else{
             return  BSR(arr,target,s,m-1);
        }

    }
}