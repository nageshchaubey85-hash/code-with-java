import java.util.*;
public class kunalf{
    public static int sum3(int a,int b){
        int sum3=a+b;
        return sum3;

    }
    public static String myGreet(String name){
        String message1="heello " + name;
        return message1;
    }
    public static void change(int[] num){
        num[0]=99;

    }
    // public static int sum2() {
    //      Scanner sc=new Scanner(System.in);
    //     System.out.print("enter the firs elements 1:");
    //     int num1=sc.nextInt();
    //     System.out.print("enter the firs elements2:");
    //     int num2=sc.nextInt();
    //     int sum=num1+num2;
    //     return sum;//return means-functions over//
    // }

    // public static void sum() {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter the firs elements 1:");
    //     int num1=sc.nextInt();
    //     System.out.print("enter the firs elements2:");
    //     int num2=sc.nextInt();
    //     int sum=num1+num2;
    //     System.out.println("sum of two number=:"+sum);
    // }
    // public static String greeting() {
    //     String greeting="how are you";
    //     return greeting;
        
    // }
        public static void main(String[] args) {
            //*here we can take the input as variables/*/
            // sum();//calling functions//
            //sum2();
        // String message=greeting();
        // System.out.println(message);
       int ans= sum3(20,30);
       System.out.println(ans);
       Scanner sc=new Scanner(System.in);
       String name=sc.next();
        String personalised=myGreet(name); 
        System.out.println(personalised);
    }
    }



