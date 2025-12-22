
import java.util.ArrayList;

public class Find {

    public static void main(String[] args) {
        int[] arr = {12, 25, 85, 76, 76, 49};
        System.out.println(findindex(arr, 85, 0));

        System.out.println(linearsearch(arr, 25, 0));
        
        System.out.println(findindexlast(arr, 76, arr.length - 1));

        findAllindex(arr, 50, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findAlindex(arr, 76, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAlindex2(arr, 76, 0));
    }

    public static int findindex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }
    }

    public static int findindexlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindexlast(arr, target, index - 1);
        }
    }

    public static boolean linearsearch(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return ((arr[index] == target) || linearsearch(arr, target, index + 1));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void findAllindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllindex(arr, target, index + 1);
    }

    public static ArrayList findAlindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index); //add in same object different refernce variable
        }
        return findAlindex(arr, target, index + 1, list);
    }

    public static ArrayList findAlindex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index); //add in same object different refernce variable
        }
        ArrayList<Integer> ansFromBelowCalls = findAlindex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
