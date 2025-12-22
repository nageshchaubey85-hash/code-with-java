import java.util.*;
public class exercise {
    public static int averageNumber(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println("average of three number:"+average);
        return 1;
        }
        public static int sumOdd(int n){
            int sum=0;
            for(int i=1;i<=n;i++){
                if(i%2!=0)
                 sum=sum+i;
            }
            System.out.println("sum of even number"+sum);
        return 1;
        }
        public static int greaterNumber(int a,int b){
            if(a>b){
                 System.out.println("A is greater:"+a);
            }else{
                System.out.println("B is greater:"+b);
            }
        return 1;
        }
          public static double circumferenceCircle(double r){
            double c;
             c=3.14*2.0*r;
            System.out.println("circumferencen of circle:"+c);
            return 1.0;
        }
        
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         int z=sc.nextInt();  
         averageNumber(x,y,z);
        // int k=sc.nextInt();
        sumOdd(5);
        int c=sc.nextInt();
         int d=sc.nextInt();
         greaterNumber(c,d);
          System.out.println("enter the radius:");
          int r=sc.nextInt();
          circumferenceCircle(r);


    }}