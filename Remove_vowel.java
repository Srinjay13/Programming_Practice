import java.util.Scanner;

public class Remove_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st=sc.next();
        String s=st.toLowerCase();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                continue;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        // System.out.println(ans);
        method2();
    }
    public static void method2(){
        String s = "prepinsta";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1);
    }
}
