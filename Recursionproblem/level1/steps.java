public class steps{
    public static void main(String[] args) {
        System.out.println(steps(41));
    }
    public static int steps(int n){
        return helper(n,0);
        }
        public static int helper(int n, int c){
            if(n==0){
                return c;
            }
            if(n%2==0){
                return helper(n/2,c+1);
            }
            return helper(n-1,c+1);
//helper function is take to add extra argument into the function
        }
    }