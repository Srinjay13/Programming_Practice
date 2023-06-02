// Write a method that uses a while loop. This method would replace every vowel in the String with X.

import java.util.*;
public class replace_vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String replacedString = "";
			int i = 0;

			while (i < str.length()) {
				if (str.charAt(i) == ('a') || str.charAt(i) == ('e') || str.charAt(i) == ('i') || str.charAt(i) == ('o')
						|| str.charAt(i) == ('u')) {
					replacedString += 'X';
				} else {
					replacedString += str.charAt(i);
				}
				i++;
			}
            System.out.println(replacedString);

    }
}