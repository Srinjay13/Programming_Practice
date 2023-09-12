import java.util.Arrays;
import java.util.Scanner;

public class decrypt_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        if(n>str.length())
            System.out.println("-1");
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                int val=str.charAt(i)-'a';
                freq[val]=Integer.valueOf(str.charAt(i+1)+"");
            }
        }
        // System.out.println(Arrays.toString(freq));
        int ans=0;
        String s="";
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                ans+=freq[i];
                if(ans>=n){
                    char ch=(char)(i+97);
                    s+=ch;
                    break;
                    // System.out.println(ch);
                    //break;
                }
            }
        }
        System.out.println(s);

        // int sum=0;
        // String ans="";
        // if(n>str.length()){
        //     System.out.println(-1);
        // }
        // for(int i=0;i<str.length();i++){
        //     if(i%2!=0){
        //         sum+=Integer.valueOf(str.charAt(i)+"");
        //         if(sum>=n){
        //             ans+=str.charAt(i-1);
        //             break;
        //         }
        //     }
        // }
        // System.out.println(ans);
    }
}
