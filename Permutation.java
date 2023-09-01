public class Permutation {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){    
            fact=fact*i;    
        }  
        return fact;  
    }
    public static void main(String[] args) {
        String str="aabbbc";
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i)-'a';
            freq[val]++;
        }
        int pro=1;
        int num=fact(str.length());
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                pro*=fact(freq[i]);
            }
        }
        int ans=num/pro;
        System.out.println(ans);
    }
}
