import java.util.*;

public class Perfect_square {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double sqr=Math.sqrt(n);
    // System.out.println(sqr);
    if((sqr*sqr)==n)
        System.out.println("Perfect square");
    else
        System.out.println("Not a perfect square");
    }
    
    
}
