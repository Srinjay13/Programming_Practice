//Amake ekta array dewa ache jetate A to z ache r amake mome r nam print korte hobe
import java.util.Scanner;
public class Mome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str=sc.next();
        String ans="";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<arr.length;j++){
                if(str.charAt(i)==arr[j]){
                    ans+=arr[j];
                }
            }
        }
        System.out.println(ans);

        
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(str.charAt(j)==arr[i]){
        //         ans+=arr[i];
        //         j++;
        //     }
        // }
        // System.out.println(ans);
    }
}