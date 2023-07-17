public class Check_to_pow_of_2 {
    public static void main(String[] args) {
        int n=64;
        double ans=log3(243);
        System.out.println(ans);
        // System.out.println(check(n));
    }
    public static double log2(int x) {
		return Math.log(x) / Math.log(2);
	}
    public static double log3(int x) {
		return Math.log(x) / Math.log(3);
	}
    public static boolean check(int n){
        if(Math.floor(log2(n))==(log2(n))){
            return true;
        }
        return false;
    }
}
