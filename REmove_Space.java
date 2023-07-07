import java.util.Scanner;

public class REmove_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st=sc.next();
        String ans="";
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c==32){
               continue;
            }
            else{
                ans+=c;
            }
        }
        System.out.println(ans);
        method2();
    }
    public static void method2() {
        String s="Prep Insta";
        s=s.replaceAll(" ","");
        System.out.println(s);        
    }
}
