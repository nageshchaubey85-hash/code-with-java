public class pattern2{
public static void main(String[] args) {
    pattern1(5);
     pattern2(5);
     pattern3(5);
     pattern4(5);
     pattern5(5);
     pattern6(5);
     pattern7(5);
}
public static void pattern1(int n){
    for (int row = 1; row <=n; row++) {

    for (int space = 1; space <= n-row; space++) {
        System.out.print(" ");
    }
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        }
        System.out.println("");
        
    }

}
public static void pattern2(int n){
    for (int row = 1; row <=n; row++) {

    for (int space = 1; space <= n-row; space++) {
        System.out.print(" ");
    }
        for (int col = 1; col <= row; col++) {
            System.out.print("* ");
        }
        System.out.println("");
        
    }
    System.out.println("");

}
public static void pattern3(int n){
    for (int row = n; row >=1; row--) {

    for (int space = n-row ;space>=1; space--) {
        System.out.print(" ");
    }
        for (int col = 1; col <=row; col++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }

}
public static void pattern4(int n){
    for (int row = 1; row <=n; row++) {

    for (int space =n-row ;space>=1; space--) {
        System.out.print(" ");
    }
        for (int col = 1; col <=row*2-1; col++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
    System.out.println("");

}
public static void pattern5(int n){
    for (int row = n; row >=1; row--) {

    for (int space =1 ;space<=n-row; space++) {
        System.out.print(" ");
    }
        for (int col = 1; col <=row; col++) {
            System.out.print("* ");
        }
        System.out.println("");
        
    }

}
public static void pattern6(int n){
    for (int row = 1; row <=2*n-1; row++) {
int tp=row>n?2*n-row-1:row-1;
    for (int space =1 ;space<=tp; space++) {
        System.out.print(" ");
    }
    int tc=row>n?row-n+1:n-row+1;
        for (int col = 1; col <=tc; col++) {
            System.out.print("* ");
        }
        System.out.println("");
        
    }

}
public static void pattern7(int n){
    for (int row = 1; row <=n; row++) {
    for (int space =1 ;space<=n-row; space++) {
        System.out.print(" ");
    }
    int tp=row<2?row:2;
        for (int col = 1; col<=tp; col++) {
            System.out.print("* ");
            for (int sp = 1; sp <=; sp++) {
                System.out.print(" ");
                
            }
        }
        // for (int sp = 1; sp <=row-1; sp++) {
        //         System.out.print(" ");
                
        //     }
        System.out.println("");
        
    }

}
}




