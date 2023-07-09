public class Remove_a_from_string {
    public static void main(String[] args) {
        String str="baccad";
        // System.out.println(way1(str,""));
        System.out.println(way2(str));
    }
    public static String remove(String s,int i,String ans) {
        //Eta kaj korchena kno bujhchina bhai 
        if(i==s.length()-1)
        {
            return s;
        }
        char c=s.charAt(i);
        if(c=='a'){
            return remove(s, i+1,ans);
        }
        else{
            ans+=c;
            return remove(s, i+1, ans);
        }
    }
    public static String way1(String s,String ans){
        if(s.length()==0){
            return ans;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return way1(s.substring(1),ans);
        }
        else{
            ans+=ch;
            return way1(s.substring(1),ans);
        }
    }
    public static String way2(String s) {
        if(s.length()==0){
            return s;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return ""+way2(s.substring(1));
        }
        else{
            return ch+way2(s.substring(1));
        }
        
    }
}
