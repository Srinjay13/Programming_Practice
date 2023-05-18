import java.util.Scanner;

public class replace_all_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        String ans="";
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            if(currChar=='0'){
                ans+='1';
            }
            else{
                ans+=currChar;
            }
        }
        System.out.println(ans);
    }
    public static int replace(int number)
    {
        // Base case for recursion termination
        if (number == 0)
        return 0;
        // Extract the last digit and change it if needed
        int digit = number % 10;
        if (digit == 0)
        digit = 1;
        // Convert remaining digits and append the last digit
        return replace(number/10) * 10 + digit;
    }
}
