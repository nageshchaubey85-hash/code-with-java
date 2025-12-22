
public class factorial3 {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }else {
            return n * fact(n - 1);
        }

    }

    public static int sum(int n) {
        return switch (n) {
            case 0 ->
                0;
            case 1 ->
                1;
            default ->
                n + sum(n - 1);
        };

    }

}
