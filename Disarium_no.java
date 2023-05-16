import java.util.*;
public class Disarium_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int sum=0;
        String num=String.valueOf(n);
        for(int i=0;i<num.length();i++){
            sum+=(int)Math.pow(Integer.valueOf(""+num.charAt(i)),i+1);
            // System.out.println(sum);
        }
        if(sum==n){
            System.out.println("Disarium Number");
        }
        else{
            System.out.println("Not a Disarium Number");
        }
        */
        //Pal
        int m=n,sum=0;
        String num=""+m;
        int len=num.length();
        int[] arr=new int[len];
        int j=len-1;
        while(m!=0){
            int rem=m%10;
            arr[j]=rem;
            j--;
            m=m/10;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            sum+=(int)Math.pow(arr[i],i+1);
            //System.err.println(sum);
        }
        if(sum==n){
            System.out.println("Disarium Number");
        }
        else{
            System.out.println("Not a Disarium Number");
        }
    }
}
