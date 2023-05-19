import java.util.Scanner;

public class Addition_of_fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int den1=sc.nextInt();
        int num2=sc.nextInt();
        int den2=sc.nextInt();
        int lcm=lcm(den1,den2);
        int qn1=num1*(lcm/den1);
        int qn2=num2*(lcm/den2);
        int sum=qn1+qn2;
        int newnum=sum;
        int newden=lcm;
        int hcf=hcf(sum,lcm);
        int fin_num=newnum/hcf;
        int fin_den=newden/hcf;
        System.out.println("The sum is: "+fin_num+" / "+fin_den);
    }
    public static int hcf(int n1,int n2){
        int hcf=0;
        for(int i=1;i<n1 || i<n2;i++){
            if(n1%i == 0 && n2%i == 0){
                hcf=i;
            }
        }
        return (hcf);
    }
    public static int lcm(int n1,int n2){
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
        for(int i=1;i<=max;i++){
            for(j=1;j<=max;j++){
            if(arr1[i]==arr2[j]){
                return (arr2[j]);
                // break outer;
            }
            }
        }
        return 1;
    }
}
