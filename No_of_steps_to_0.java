//Given an integer num, return the number of steps to reduce it to zero.

//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class No_of_steps_to_0 {
    public static void main(String[] args) {
        int n=41;
        System.out.println(check(n,0));
    }
    public static int check(int n,int steps) {
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return check(n/2, steps+1);
        }
        else{
            return check(n-1, steps+1);
        }
        
    }
}
