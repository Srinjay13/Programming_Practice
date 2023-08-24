public class Anagram {
    public static boolean isAnagram(String s, String t){
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'a';
            freq1[val]++;
        }
        for(int i=0;i<t.length();i++){
            int val=t.charAt(i)-'a';
            freq2[val]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]==freq2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean val=isAnagram("rat","car");
        System.out.println(val);
    }
}
