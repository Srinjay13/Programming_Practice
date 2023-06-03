public class Remove_duplicates {
    public static void rec(int idx,String str,String newStr){
        if(idx==str.length()-1){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        char nextChar=str.charAt(idx+1);
        if(currChar==nextChar){
            newStr+=currChar;
            rec(idx+2,str,newStr);
        }
        else{
            newStr+=currChar;
            rec(idx+1,str,newStr);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        rec(0,str,"");
    }
}
