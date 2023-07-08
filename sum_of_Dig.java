public class sum_of_Dig {
    public static void main(String[] args) {
        int ans=sum(1234);
        System.out.println(ans);
    }
    public static int sum(int n) {
        if(n==0){
            return n;
        }

        return n%10+sum(n/10);
    }
}
