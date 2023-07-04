import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st=sc.next();
        StringBuffer sbfr = new StringBuffer(st);
        sbfr.reverse();
        
        String rev=sbfr.toString();
        System.out.println(rev);
        method2();
    }
    public static void method2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st=sc.next();
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);

        }
        System.out.println(rev);
    }
}
