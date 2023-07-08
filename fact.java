public class fact{
    // public static int pro=1;
    public static void main(String[] args) {
        System.out.println(fact(5,1));
        
    }
    public static int fact(int n,int pro){
        if(n==1){
            return pro;
        }
        pro*=n;
        return fact(n-1,pro);
    }
}