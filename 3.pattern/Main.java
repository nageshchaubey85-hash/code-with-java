public class Main{
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern31(4);
        
    }
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {

                System.out.print("* ");
            }
            System.out.println("");

            
        }
        System.out.println("");
    }
    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col=1; col<=n; col++) {

                System.out.print("* ");
            }
            System.out.println("");

            
        }
        System.out.println("");
    }
     public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col=1; col<=n-row+1; col++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
          System.out.println("");
    }
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col=1; col<=row; col++) {

                System.out.print(col+" ");
            }
            System.out.println("");
        }
         System.out.println("");
    }
    public static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for (int col=1; col<=row; col++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int row = 1; row <= n; row++) {
            for (int col=2; col<=n-row+1; col++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int tc=row>n?2*n-row:row;
            for (int col = 0; col < tc; col++) {

                  System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
     
    public static void pattern31(int n){
        int  originalN=n;
            n=2*n;
        for (int row = 0; row <= n; row++) {
            for (int col=0; col<=n; col++) {
                int ateveryindex=originalN-Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println("");
        }

    }
    
    }
