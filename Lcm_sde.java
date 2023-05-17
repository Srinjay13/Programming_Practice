import java.util.Arrays;
import java.util.Scanner;

public class Lcm_sde {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        // int num1=n1,num2=n2;
        int lcm=Math.max(n1,n2);
        //Not running for all Test cases
        /*while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println(lcm);
                break;
            }
        }
        */
        int max=Math.max(n1,n2);
        int[] arr1=new int[max+1];
        int[] arr2=new int[max+1];
        for(int i=1;i<=max;i++){
            arr1[i]=n1*i;
        }
        for(int i=1;i<=max;i++){
            arr2[i]=n2*i;
        }
        int j=1;
        outer:for(int i=1;i<=max;i++){
            for(j=1;j<=max;j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr2[j]);
                break outer;
            }
            }
        }

    }
}
