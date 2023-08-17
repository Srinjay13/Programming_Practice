import java.util.Arrays;

public class Autobiographical_number {
    public static void main(String[] args) {
        String s="1234";
        int[] freq=new int[s.length()];
        // int n=Integer.valueOf(s);
        for(int i=0;i<s.length();i++){
            String val=s.charAt(i)+"";
            // System.out.println(val);
            int v=Integer.valueOf(val);
            while(v!=0){
                freq[i]++;
                v--;
            }
        }
        System.out.println(Arrays.toString(freq));
        int c=0;
        for(int i=0;i<freq.length;i++){
            // System.out.println(Integer.valueOf(String.valueOf(s.charAt(i))));
            if(freq[i]!=Integer.valueOf(String.valueOf(s.charAt(i)))){
                // System.out.println("Not an Autobiographical number");
                c++;
            }
        }
        // System.err.println(c);
        if(c==0){
            System.out.println("Autobiographical number");
        }
        else{
            System.out.println("Not ");
        }
    }
}
