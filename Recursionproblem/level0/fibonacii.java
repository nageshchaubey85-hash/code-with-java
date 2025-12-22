public class fibonacii{
public static void main(String[] args) {
    System.out.println(fib(4));
    // System.out.println(ans);
}
public static int fib(int n){
   if(n<2){
    return n;
   }
    else
     return (fib(n-1)+fib(n-2));
    
}
}
