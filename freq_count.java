import java.util.Scanner;

public class freq_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i)-'a';
            freq[val]++;
        }
        String ans="";
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char ch=(char)(i+97);
                ans+=ch;
                ans+=freq[i];
            }
        }
        System.out.println(ans);
    }
}
