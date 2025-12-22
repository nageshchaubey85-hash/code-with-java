
public class Countzeroes {

    public static void main(String[] args) {
        System.out.println(countzero(1001));

    }

    public static int countzero(int n) {
        return helper(n, 0);

    }

    public static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int d = n % 10;
        if (d == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }

}
