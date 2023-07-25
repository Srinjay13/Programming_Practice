public class Sum_of_dig_rec {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(len(n,0));
    }
    public static int len(int n,int ans) {
        if(n==0){
            return ans;
        }
        ans+=n%10;
        return len(n/10, ans);
    }
}
