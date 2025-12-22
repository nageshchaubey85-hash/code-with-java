import java.util.*;
public class functinsheet{
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("NOT EVEN NUMBER");
        }

    }
     public static void primeNumber(int n){
        int num=0;
        for(int i=1;i<=n;i++){
        if(n%i==0);
            num++;
            }
            
            if(num==2){
                System.out.println(" prime number");
            }
        else{
            System.out.println("Not a prime number");
        }
        }
        
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    evenOdd(n);
    int y=sc.nextInt();
    
    primeNumber(y);


}}