
import java.util.ArrayList;

public class dice {

    public static void main(String[] args) {
        // dice("",5);
        System.out.println(dicethrow("", 4));
        diceface("", 4, 6);
        System.out.println(dicefaceret("", 4, 6));

    }

    public static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    public static ArrayList<String> dicethrow(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dicethrow(p + i, target - i));
        }
        return list;
    }

    public static void diceface(String p, int target, int faces) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= faces && i <= target; i++) {
            diceface(p + i, target - i, faces);
        }
    }

    public static ArrayList<String> dicefaceret(String p, int target, int faces) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= faces && i <= target; i++) {
            list.addAll(dicefaceret(p + i, target - i, faces));
        }
        return list;
    }

}
