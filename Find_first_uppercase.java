public class Find_first_uppercase{
    public static void main(String[] args) {
        String str="geeksforGeeks";
        char ch=find(str);
        System.out.println(ch);
    }
    public static char find(String s) {
        if(s.length()==0){
            return s.charAt(0);
        }
        char ch=s.charAt(0);
        if(Character.isUpperCase(ch)){
            return ch;
        }
        else{
            return find(s.substring(1));
        }
    }
}