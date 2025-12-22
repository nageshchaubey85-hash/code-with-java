import java.util.*;
public class ArraysList{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         //syntax//

         ArrayList <Integer> list=new ArrayList(5); //more then capacity can also be taken
        //  list.add(23);
        //   list.add(1313);
        //    list.add(465);
        //     list.add(54654);
        //   list.add(789);
        //    list.add(21);
        //     list.add(23);
        //   list.add(1313);
        //    list.add(465);
        //     list.add(54654);
        //   list.add(789);
        //    list.add(21);
        //    System.out.println(list.contains(22134578)); //if not present return false
        //    list.set(0,99);//add 99 at o index
        //    list.remove(3); //remove element of 3 index
        //     System.out.println(list);

             //input//

            for (int i = 0; i < 4; i++) {
                list.add(sc.nextInt());
                
            }
            //get item at any index//

            for (int i = 0; i < 4; i++) {
                System.out.print(list.get(i)+" ");// PASS INDEX HERE,LIST[INDEX] SYNTAX WILL NOT WORK HERE
                
            }
    }
}