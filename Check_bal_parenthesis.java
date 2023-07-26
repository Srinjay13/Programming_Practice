//Check for balanced parenthesis without using stack

import java.util.Arrays;

public class Check_bal_parenthesis {
    public static void main(String[] args) {
        String str="{[({)]}";
        /*
        This will run for some test cases where the number of opening braces and closing braces are same
        int open=0,closed=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                open++;
            }
            else if(ch=='}'||ch==')'||ch==']'){
                closed++;
            }
        }
        if(open==closed){
            System.out.println("Balanced Parenthesis !");
        }
        else{
            System.out.println("Not Balanced Parenthesis !");
        }
        */
        //
        char[] arr=str.toCharArray();
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                for(int j=0;j<arr.length;j++){
                    char ch=arr[j];
                    if(ch==')'){
                        arr[j]=' ';
                        arr[i]=' ';
                    }
                }
            }
            if(arr[i]=='{'){
                for(int j=0;j<arr.length;j++){
                    char ch=arr[j];
                    if(ch=='}'){
                        arr[j]=' ';
                        arr[i]=' ';
                    }
                }
            }
            if(arr[i]=='['){
                for(int j=0;j<arr.length;j++){
                    char ch=arr[j];
                    if(ch==']'){
                        arr[j]=' ';
                        arr[i]=' ';
                    }
                }
            }
           
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(check(arr,0));
    }
    public static boolean check(char[] arr,int i) {
            if(i==arr.length-1){
                return true;
            }
            if(arr[i]==' '){
                return check(arr,i+1);
            }
            else{
                return false;
            }
        }
}
