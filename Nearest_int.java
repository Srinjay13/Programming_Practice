public class Nearest_int {
    public static int near(int num,int m){
        int div=num/m;
        int ans1=m*div;
        int ans2=m*(div+1);
        int diff1=Math.abs(num-ans1);
        int diff2=Math.abs(num-ans2);
        if(diff1<diff2)
            return ans1;
        else
            return ans2;
    }
    public static void main(String[] args) {
        System.out.println(near(-4,4));
    }
}
