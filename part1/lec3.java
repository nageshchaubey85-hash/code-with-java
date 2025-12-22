import java.util.*;
public class lec3 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age > 18){
          System.out.println("Adult");
    }else{
        System.out.println(" Not Adult");
    }
     Scanner sc2=new Scanner(System.in);
     int x=sc2.nextInt();
    if(x%2==0){
        System.out.println("even number");
    }else{
        System.out.println("Not Even number");
    }
     Scanner sc3=new Scanner(System.in);
     int a=sc3.nextInt();
     int b=sc3.nextInt();
    //  int c=sc3.nextInt();
      if(a==b){
        System.out.println("equal number");
    }else{
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
        Scanner sc4=new Scanner(System.in);
        int but=sc4.nextInt();
//         if(but==1){
//             System.out.println("hello");
//         }
//         else if(but==2){
//             System.out.println("namste");
//         }
//         else if(but==4){
//             System.out.println("bonjur");
//         }

// else{
//     System.out.println("invalid number");
// }
switch (4) {
    case 1:System.out.println("hello");
        break;
         case 4:System.out.println("nagesh");
        break;
         case 2:System.out.println("radhe");
        break;
         case 3:System.out.println("madhav");
        break;
    default:System.out.println("invalid");
}
    }

}
}
