import java.util.*;
public class Harshad_no {
    public static void main(String[] args) {
        int n=24;
        int num=n,sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(num%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}
