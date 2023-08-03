public class First_non_repeating_char {
    public static void main(String[] args) {
        String str="pppppa";
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)&& i!=j){
                flag=true;
                break;
            }
        }
        if(flag==false){
                System.out.println(str.charAt(i));
                System.out.println(i);
                break;
            }
            flag=false;
        }
    }
}
