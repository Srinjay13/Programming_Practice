/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 

Constraints:

s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
*/

public class Shuffle_String {
    public static void main(String[] args) {
        /*class Solution {
            public String restoreString(String s, int[] indices) {
                // My solution
                // String ans="";
                // for(int i=0;i<indices.length;i++){
                //     for(int j=0;j<indices.length;j++){
                //         if(indices[i]==j){
                //             ans+=s.charAt(j);
                //         }
                //     }
                // }
                // return ans;
        
                char [] ans = new char[indices.length];
                for(int i=0;i<s.length();i++)
                {
                    ans[indices[i]]=s.charAt(i);
                }
                return new String(ans);
        
        
                // HashMap<Integer, Character> hm = new HashMap<>();
                // for(int i=0;i<s.length();i++){
                //     hm.put(indices[i],s.charAt(i));
                // }
                // String st = "";
                // for(int i=0;i<s.length();i++){
                //     st=st+hm.get(i);
                // }
                // return st;
            }
        }
        */
    }
}
