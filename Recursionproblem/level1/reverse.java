
public class reverse {

    static int sum = 0;

    public static void rev(int n) {
        if (n == 0) {
        } else {
            int d;
            d = n % 10;
            sum = sum * 10 + d;
            rev(n / 10);
        }
    }

    static boolean paillain(int n) {
        return (n == rev2(n));
    }

    public static int rev2(int n) {
        //sometimes you might need some additional variables in the argument
        //in that case ,make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        rev(369);
        System.out.println(sum);
        System.out.println(rev2(123456789));
        System.out.println(paillain(1213));
    }
}
