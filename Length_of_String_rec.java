import java.util.Scanner;

public class Length_of_String_rec{
    public static int cnt=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("The length of "+str+" is: "+rec2(str,'\0',0));
    }
    public static int find_length(String s){
        /*if(idx==s.length()){
            return cnt;
        }
        cnt++;
        return find_length(s, idx+1);
        */
        //PrepInsta's way
        // if we reach at the end of the string
        if (s.equals(""))
            return 0;
        else
            return find_length(s.substring(1)) + 1;
    }
    public static int rec(String s,int i){
        if(s.charAt(i)==' '){
            return cnt;

        }
        cnt++;
        return rec(s.substring(1),i++);
    }
    public static int rec2(String s,char c,int i){
        if(c==' '){
            return cnt;

        }
        cnt++;
        i++;
        return rec2(s,s.charAt(i),i);
    }
}