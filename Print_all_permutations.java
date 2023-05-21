import java.util.Scanner;
public class Print_all_permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        print_perm(str,0,"");
    }
    public static void print_perm(String str,int idx,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            print_perm(newStr, idx+1, perm+currChar);
        }
    }
}
