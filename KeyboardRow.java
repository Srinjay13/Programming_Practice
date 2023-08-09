/*
500. Keyboard Row
Easy
1.4K
1.1K
Companies
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 

Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 
*/

public class KeyboardRow{
    public static void main(String[] args) {
        String one="qwertyuiop";
        String two="asdfghjkl";
        String three="zxcvbnm";
        String word1="qwer";
        String word2="alaska";
        int ans1=0;
        int ans2=0;
        int ans3=0;
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<one.length();j++){
                if(word1.charAt(i)==one.charAt(j)){
                    ans1++;
                    break;
                }
            }
            for(int j=0;j<two.length();j++){
                if(word1.charAt(i)==two.charAt(j)){
                    ans2++;
                    break;
                }
            }
            for(int j=0;j<three.length();j++){
                if(word1.charAt(i)==three.charAt(j)){
                    ans3++;
                    break;
                }
            }
        }
        if(ans1==word1.length())
            System.out.println("Present");


        //Brute Force Solution
        /*
        class Solution {
            public String[] findWords(String[] words) {
                String arr[] = { "qwertyuiop","asdfghjkl","zxcvbnm"}; 
                ArrayList<String>list = new ArrayList<>();

                for(int i = 0;i<3;i++){
                    for(int j = 0; j<words.length;j++){
                        String emp = "";
                        String str = words[j].toLowerCase();
                        for(int k = 0;k<str.length();k++){
                            String test = str.charAt(k)+"";
                                if(arr[i].contains(test)){
                                    emp=emp+test;
                                }                   
                        }
                        if(emp.equals(str)){
                            list.add(words[j]);
                        }
                    }
                }
                String[] ans = new String[list.size()];
                for(int i = 0;i<list.size();i++){
                    ans[i]=list.get(i);
                }
                return ans;
            }
        }
        */

        //Efficient Solution 
        /*
        class Solution {
            public String[] findWords(String[] words) {
                int[] rowMap = new int[26];
                String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
                
                for (int i = 0; i < rows.length; i++) {
                    for (char c : rows[i].toCharArray()) {
                        rowMap[c - 'A'] = i;
                    }
                }
                
                List<String> result = new ArrayList<>();
                for (String word : words) {
                    int row = rowMap[word.toUpperCase().charAt(0) - 'A'];
                    boolean onSameRow = true;
                    for (char c : word.toUpperCase().toCharArray()) {
                        if (rowMap[c - 'A'] != row) {
                            onSameRow = false;
                            break;
                        }
                    }
                    if (onSameRow) {
                        result.add(word);
                    }
                }
                return result.toArray(new String[0]);   
            }
        }
        */
    }
}