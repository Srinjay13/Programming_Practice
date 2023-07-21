public class Len_of_str_rec {
    public static void main(String[] args) {
        String str="Mome";
        int ans=length(str,0);
        System.out.println(ans);
    }
    public static int length(String s,int ans) {
        if(s.length()==0){
            return ans;
        }
        return length(s.substring(1), ans+1);
    }
}
