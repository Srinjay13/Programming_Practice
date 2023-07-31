public class Rem_cons_dupl {
    public static void main(String[] args) {
        String s="aaabb";
        // char curr=str.charAt(0);
        // Initialize start and stop pointers
        int i = 0;
        int j = 0;
    
        // Initialize an empty string for new elements
        String newElements = "";
    
        // Iterate string using j pointer
        while (j < s.length()) {
    
        // If both elements are same then skip
        if (s.charAt(i) == s.charAt(j)) {
            j++;
        }
    
        // If both elements are not same then append new
        // element
        else if (s.charAt(j) != s.charAt(i)
                || j == s.length() - 1) {
            newElements += s.charAt(i);
    
            // After appending, slide over the window
            i = j;
            j++;
        }
        }
    
        // Append the last string
        newElements += s.charAt(j - 1);
        System.out.println(newElements);
        // System.out.println(remove(str,""));
    }
    public static String remove(String str,String ans) {
        if(str.length()==0){
            return ans;
        }
        char ch=str.charAt(0);
        char nxt=str.charAt(1);
        if(ch==nxt){
            ans+=ch;
            return remove(str.substring(2),ans);
        }
        else{
            ans+=ch;
            return remove(str.substring(1), ans);
        }
        
    }
}
