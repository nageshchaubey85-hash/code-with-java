import java.util.*;
public class pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
         System.out.println(" ");
        int n=5;
                for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){//j<=n-i+1 also
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //floids triangle//
         int m=6;
         int num=1;
                for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){//j<=n-i+1 also
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
        int p=5;
                for(int i=1;i<=p;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println(" ");
    
        }
        }
        }