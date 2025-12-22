
public class print1ton1 {

    public static void main(String[] args) {
        // fun(5);
        // funRev(5);
        funBoth(5);
        // concepts(5);
    }

    public static void concepts(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // concepts(n--);//print 5 only
        concepts(--n);
        // --n(subtract first then pass) and n--(pass the value of n first then n=n-1)
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    public static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);//when function call is finish then print
        System.out.println(n + " ");
    }

    public static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        funBoth(n - 1);//when function call is finish then print
        System.out.println(n + " ");
    }
}
