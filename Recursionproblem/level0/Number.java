public class Number{
    public static void main(String[] args) {
        // print(1);
        print5(1);
    }
    public static void print(int n){
        System.out.println(n);
        print1(2);
    }
     public static void print1(int n){
        System.out.println(n);
        print2(3);
    }
     public static void print2(int n){
        System.out.println(n);
        print3(4);
    }
     public static void print3(int n){
        System.out.println(n);
        print4(5);
    }
     public static void print4(int n){
        System.out.println(n);
    }

    //RECURSION INSTEAD OF THIS//

     public static void print5(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //As many times it will call it will take separate memory for this
        //Last function call it is called tail recursion
        print5(n+1);
    }

}