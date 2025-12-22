public class sumofdigits2{
    public static void main(String[] args) {
        System.out.println(sofdigits(1111));  
        System.out.println(pod(4));
    }
    public static int sofdigits(int n){
        if(n==0){
        return 0;
        }
        return (n%10)+sofdigits(n/10);
        } 
    public static int pod(int n){
        if(n%10==n){
        return n;
        }
        return (n%10)*pod(n/10);
        } }