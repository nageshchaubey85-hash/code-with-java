
import java.util.Scanner;

public class fun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
        // int x=sc.nextInt();
        // armstrong(x);
        for (int i =100; i < 1000; i++) {
            if(armstrong(i)){
                System.out.print(i+" ");
            }
            
        }
        // boolean ans1=armstrong(x);
        // System.out.println(ans1);

        }

    //check prime number//

    public static boolean  isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c==0){
                return false;
            }
            c++;
        }
        // return c*c>n;
        if(c*c>n){
            return  true;
        }
        return false;
    }
    //  3- digit armstrong number  //


     public static boolean armstrong(int n){
        if(n<0){
            // System.out.println("not armstrong number");
            return false;
        }
         int sum=0;
         int original=n;
        while(n>0){
            int r;
             r=n%10;
            sum = sum + (r*r*r);
            n=n/10;
        }
        if (sum==original){
            // System.out.println("Armstrong number:");
            return true;
        }
        // else{
        // // System.out.println("not armstrong number");
        // }
        return false;
    }
}

    
    
    
