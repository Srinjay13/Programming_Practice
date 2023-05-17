import java.util.Scanner;

public class Creating_Username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        String email=sc.next();
        int val=-1;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                val=i;
            }
        }
        String ans=email.substring(0,val);
        System.out.println(ans);
        */

        String email = sc.next();
        String userName = "";
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
             break;
            } else {
              userName += email.charAt(i);
            }
          }
     
     
          System.out.println(userName);
     
    }
}
