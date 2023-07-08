public class Count_zeroes{
    public static int count=0;
    public static void main(String[] args) {
        int num=20304;
        System.out.println(count(num));
    }
    public static int count(int n) {
        if(n==0){
            return count;
        }
        int dig=n%10;
        if(dig==0)
            count++;
        return count(n/10);
        
    }
}