import java.util.Scanner;

public class Cumulative_lebgth_of_String_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            int len=arr[i].length();
            sum+=len;
        }
        System.out.println("The sum of all the Strings are:"+sum);
    }
}
