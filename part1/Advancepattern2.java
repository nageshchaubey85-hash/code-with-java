public class Advancepattern2{
    public static void main(String args[]){
        int m=10;
        //space//
        for (int i = 1; i <= m; i++) {
            for(int j=1;j<=(m-i);j++){
                System.out.print(" ");
            }
            //stars//
            for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println("");  
        }
        //pattern-2//
        int n=5;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println("");  
        }
        //pattern-3//pailendrom number//
         int p=5;
        for (int i = 1; i <= p; i++) {
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }

        System.out.println("");  
        }
        //pattern-05//
         int x=5;
        for (int i = 1; i <= x; i++) {
            for(int j=1;j<=(n-i);j++){
           System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println(" ");
        }
        for (int i =x;i >=1; i--) {
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
         System.out.println(" ");
        }

    }
    }