
import java.util.*;

public class stringsearch {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        //create string as arrays//
        /*        String[] name= new String [4];
     
     System.out.println(" enter the elements:");

    for (int i = 0; i < name.length; i++) {
        name[i]=sc.next();
        
    }
     System.out.println(Arrays.toString(name));

         */
        String name = "trishank";
        char target = 'h';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));

    }

    public static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
