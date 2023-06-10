public class Move_all_x_to_last {
    /*public static int count =0;
    public static string Str(int idx,String str,char el,String newstr){
        char currch=str.charAt(idx);
        if(currch== el){
            newstr=currch+newstr;
            Str(idx+1,str,el,newstr);
            return newstr;
        }
        else{
            count++;
        }
        return newstr;
    }
    */
    public static void main(String[] args) {
       String str="axbcxxd";
       char el='x';
       int c=0;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=el){
            System.out.print(str.charAt(i));
        }
        else{
            c++;
        }
       } 
       for(int i=0;i<c;i++){
        System.out.print(el);
       }
    }
}
