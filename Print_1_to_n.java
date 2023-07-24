public class Print_1_to_n {
    public static void main(String[] args) {
        int n=10;
        print(n,1);
    }
    public static void print(int n,int i) {
        if(i==n){
            System.out.println(n);
            return;
        }
        System.out.println(i);
        print(n, i+1);
    }
}
