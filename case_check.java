// Check whether the char is a upper case or lower case 

import java.util.*;
public class case_check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0); 
        //sc.next() takes the input as a String but .trim deletes all the extra spaces around the string and .charAt(0) takes the first char of the given string
        if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercase letter");
        }
        else
        {
            System.out.println("Uppercase letter");

        }

    }
}