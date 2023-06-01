import java.util.*;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int i=st.length()-1;
        String rev="";
        while(i!=-1){
            rev=rev+st.charAt(i);
            i--;
        }
        System.out.println(rev);
    }
}
