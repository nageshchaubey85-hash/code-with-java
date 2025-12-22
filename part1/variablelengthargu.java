import java.util.*;
public class variablelengthargu{
    public static void main(String[] args) {
//          fun(1,2,3,4,5,6,7,8,9,0,8,665,4,5);
           fun(2,3,4);
//        multiple(20,40,"nagesh","radha","madhav");
    }
       public static void fun(int ...v){ // three dots//
        System.out.println(Arrays.toString(v));

    }      
    public static void fun(String...v){  //case of overloading//
        System.out.println(Arrays.toString(v));
    }
     public static void fun(int a,int b,int c){ // three dots//
          int y=a+b+c;
          System.out.println(y);
    }      
//      public static void multiple(int a,int b,String ...v){ //varlenargu always in last //
//     System.out.println(a);
//      System.out.println(b);
//     System.out.println(Arrays.toString(v));
//     }

}