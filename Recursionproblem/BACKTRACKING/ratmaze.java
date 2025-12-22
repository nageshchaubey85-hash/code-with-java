import java.util.ArrayList;
public class ratmaze{
    public static void main(String[] args) {
        // System.out.println(ratemaze(3,3));
        // pathret("",3,3);
        // System.err.println(pathretun("",3,3));
        /* boolean [][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        // };*/
         boolean [][] board1 = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        allpadirection("",board1,0,0);

        // ratemazerestrictin("",board,0,0);
        
    }
    public static int ratemaze(int row,int col){
        if(row == 1||col == 1){
            return 1;
        }
          int left =  ratemaze(row-1,col);
           int right = ratemaze(row,col-1);
            return  (left+right);
    }
    public static void pathret(String p,int r, int c){
        if(r == 1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathret(p+'D',r-1,c);
        }
        if(c>1){
            pathret(p+'R',r,c-1);
        }

    }
     public static ArrayList<String> pathretun(String p,int r, int c){
        if(r == 1&&c==1){
             ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
     ArrayList<String> list = new ArrayList<>();
        if(r>1){
        list.addAll(pathretun(p+'D',r-1,c));
        }
        if(c>1){
           list.addAll(pathretun(p+'R',r,c-1));
        }
        return list;

    }
    public static void ratemazerestrictin(String p,boolean [][] maze,int r, int c){
        if(r == maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            ratemazerestrictin(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            ratemazerestrictin(p+'R',maze,r,c+1);
        }

    }
    public static void allpadirection(String p,boolean [][] maze,int r, int c){
        if(r == maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
        allpadirection(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allpadirection(p+'R',maze,r,c+1);
        }
         if(c>0){
            allpadirection(p+'L',maze,r,c-1);
        }
         if(r>0){
            allpadirection(p+'U',maze,r-1,c);
        }


    }

}