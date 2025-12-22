import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for (int i = 1; i<=x; i++) {
             for (int  j=1; j<=y; j++) {
            System.out.print("*");
        }
        System.out.println("");
            
        }
        Scanner sc1=new Scanner(System.in);
        int b=sc1.nextInt();
        int c=sc1.nextInt();
        for (int i = 1; i<=b; i++) {
             for (int  j=1; j<=c; j++) {
                if(i==1||j==1||i==b||j==c){
            System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        }
        System.out.println("");
    }
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");

    }
     int p=5;
    for(int i=p;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");

    }
     int p2=5;
    for(int i=1;i<=p2;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");

    }
    }
    }