import java.util.Arrays;
public class Frequency{
    public static void main(String[] args) {
        String str="prepinsta";
        int[] freq=new int[27];
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'a';
            freq[ch]++;
        }
        System.out.println(Arrays.toString(freq));
    }
}