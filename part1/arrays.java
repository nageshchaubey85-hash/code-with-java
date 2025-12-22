import java.util.*;
public class arrays{
    public static void main(String[] args) {

        // ARRAYS OF PRIMITIVE//

        //dataype[]variable name=new dataype[size]//

//     int[] rows =new int[5];

          // or directly

//        int row[]={1,2,3,4,5};

//     int[]ros;  //declaration of array ros is getting defined in the stack
  
//       ros=new int[5]; //initialisation:actually here objects is being created in the memory(heap)

//     System.out.println(ros[1]);  //[0,0,0,0,0]



//      String[]arr=new String[4];

//    System.out.println(arr[0]);    //null
    
    Scanner sc=new Scanner(System.in);

    System.out.println("size of arrays");

    // int n=sc.nextInt();

    int[] arr= new int [4];
     
     System.out.println(" enter the elements:");

    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
        
    }
      
      System.out.println("arrays are:");

   for (int i = 0; i < arr.length; i++) {

     System.out.print( arr[i]+" ");
        
//        System.out.println(arr[5]);  // index out of bound error
           
        //    System.out.println(Arrays.toString(arr)); //internally use for loop

           // ARRAYS OF OBJECTS //

            // String[] arr1= new String [4] ;
            
          //  System.out.print(Arrays.toString(arr));

          // enhanced for loop//
        // for(String element: arr1){
        //     System.out.println(element); 
        // }
    
    }

    }}

