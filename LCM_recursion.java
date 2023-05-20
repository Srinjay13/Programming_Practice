import java.util.Scanner;

public class LCM_recursion {
    public static int max=-1;
    public static int lcm=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers you want to find the LCM of: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        max=Math.max(n1, n2);
        System.out.println("The Lcm of "+n1+" and "+n2+" is: "+find_lcm(n1,n2,max));
    }
    public static int find_lcm(int n1,int n2,int i){
        if(i==n1*n2)
            return lcm;
        if(i%n1==0 && i%n2==0){
            lcm=i;
        }
        return find_lcm(n1, n2, i+1);
    }
}
