import java.util.Scanner;

public class Remove_characters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st=sc.next();
        String ans="";
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if((c>=65 && c<=90)||( c>=97 && c<=122)){
               ans+=c;
            }
            else{
                continue;
            }
        }
        System.out.println(ans);
        method2();
    }
    public static void method2(){
        String s = "hel1456lo56wor%^ld09";
        s=s.replaceAll("[^a-zA-Z]","");//The Regex [^a-zA-Z] will delete (replace by "") any characters different from A to Z or a to z.
        System.out.println(s);
    }
}