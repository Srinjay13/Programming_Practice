import java.util.Scanner;

public class Count_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st=sc.next();
        String s=st.toLowerCase();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
