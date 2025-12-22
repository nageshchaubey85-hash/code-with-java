import java.util.*;
public class functions{
    public static int printMyName(String name) {
        System.out.println(name);
        return 1;
        }
        public static int Addition(int a ,int b) {
            int sum;
            sum=a+b;
        // System.out.println(sum);
        return sum;
        }
         public static int Multiply(int a ,int b) {
            int mul;
            mul=a*b;
            System.out.println(mul);
            return 1;
            }
            public static int factorial(int n) {
                if(n<0){
                    System.out.println("invalid number");
                    return 1;
                }
            int fact=1;
            for(int i=1;i<=n;i++){
            fact=fact*i;
            }
            System.out.println(fact);
            return 1;
            }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int x=sc.nextInt();
        int y=sc.nextInt();
        printMyName(name);
         int z=Addition(x,y);
       System.out.println("sum of 2 numberis:"+ z);
        int p=sc.nextInt();
        int q=sc.nextInt();
         Multiply(p, q);
            int n=sc.nextInt();
         factorial(n);
    }
    }
