public class scope{
   static int x=90; //this will shadowed
    public static void main(String[] args) {
        int a=10;
        String name="kuunaal";
        {
//            int a=35; / /already initialize outside 
               a=100;
               System.out.println(a);
               int c=90;
               //vallues initializes in this block will be remain in this block//
               name = "nagesh";
               System.out.println(name);
        }
        System.out.println(a);
//      System.out.println(c);  // cannot find outside of block
          System.out.println(name);
          for (int i = 0; i < 3; i++) {
//           System.out.print(i);
              a=34;
              System.out.println(i);
          }
          System.out.println(a);
             int x=30; //always initialized
            System.out.println(x);
          fun();
    }
    public static void fun(){
      System.out.println(x);
    }
}