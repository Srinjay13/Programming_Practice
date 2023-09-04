public class Reverse_string {
    public static String rev(String s){
        StringBuilder inp=new StringBuilder();
        inp.append(s);
        inp.reverse();
        return inp.toString();
    }
    public static void main(String[] args) {
        String ans=rev("stars");
        System.out.println(ans);
    }
}
