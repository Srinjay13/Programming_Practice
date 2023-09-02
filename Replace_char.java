public class Replace_char {
    public static String replace(String str,char a,char b){
        String ans="";
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)==a){
                ans+=b+"";
            }
            else if(str.charAt(i)==b){
                ans+=a+"";
            }
            else{
                ans+=str.charAt(i);
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(replace("misti",'s','t'));
    }
}
