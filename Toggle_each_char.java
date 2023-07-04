import java.util.*;
public class Toggle_each_char{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st=sc.next();
        String ans="";
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c>=65 && c<=90){
                c=(char)(c+32);
                ans+=c;
            }
            else{
                c=(char)(c-32);
                ans+=c;
            }
        }
        System.out.println("Toggled String : "+ans);
        method2();
    }
    public static void method2(){
        String s = "PrePInsTa";
	 String s1 = "";
	 for (int i = 0; i < s.length(); i++) {
		if(Character.isUpperCase(s.charAt(i))) 
			 s1=s1+Character.toLowerCase(s.charAt(i));
		else 
			 s1=s1+Character.toUpperCase(s.charAt(i));
	}
	System.out.println("Toggled String is : "+s1);
    }
}