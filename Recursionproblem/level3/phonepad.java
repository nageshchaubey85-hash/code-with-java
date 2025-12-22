import java.util.ArrayList;
public class phonepad{
    public static void main(String[] args) {
        phonepad("","12");
        System.out.println(phonepade("","45"));
         System.out.println(phonepadcount("","45"));
        
    }
    public static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3 ;i < digit*3;i++){
          char ch = (char)('a'+i);
          phonepad(p+ch,up.substring(1));

        }

    }
     public static ArrayList<String> phonepade(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
         ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3 ;i < digit*3;i++){
          char ch = (char)('a'+i);
          list.addAll(phonepade(p+ch,up.substring(1)));
        }
        return list;

    }
        public static int phonepadcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3 ;i < digit*3;i++){
          char ch = (char)('a'+i);
          count = count+phonepadcount(p+ch,up.substring(1));

        }
        return count;

}
}