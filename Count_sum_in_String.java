/*import java.util.Scanner;

public class Count_sum_in_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st=sc.next();
        int n=Integer.valueOf(st);
        int sum=0;
        while(n!=0){
            int dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println(sum);
    }
}
*/
import java.util.*;
public class Count_sum_in_String {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.nextLine();
        int sum=0;
        s1=s1.replaceAll("[^0-9]","");
        Integer number = Integer.valueOf(s1); //convert from String to integer
        for(int i =0;i< s1.length();i++){
        sum= sum +number % 10;
        number=number/10;
        }
        System.out.println(sum);
    }
}
