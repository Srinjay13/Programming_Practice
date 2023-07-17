public class Check_to_pow_of_3 {
    public static void main(String[] args) {
        int n=243;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        return (n==1);
    }
    public static boolean rec(int n){
         if(n==1) 
            return true;
        if(n%3 !=0 || n<=0) 
            return false;
        return isPowerOfThree(n/3);
    }
}

