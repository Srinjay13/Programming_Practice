import java.util.Scanner;


public class Remove_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st=sc.next();
        String ans="";
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if((c==40)||( c==41)||(c==91)||(c==93)||(c==123)||(c==125)){
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
        String s="1(2{3[4]})";
        s=s.replaceAll("[(){}]","");
        System.out.println(s);
    }
}
