public class Check_prime {
    public static void main(String[] args) {
        int n=17;
        System.out.println(check(n,2));
    }
    public static boolean check(int n,int i) {
        if(i==n){
            return true;
        }
        if(n%i!=0)
            return check(n,i+1);
        else
            return false;
    }
}
