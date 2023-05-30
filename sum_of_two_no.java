// Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 


import java.util.*;
class adding
{
    int num1,num2;
    int add(int num1,int num2)
        {
            int sum=0;
            sum=num1+num2;
            return sum;
        }
}
public class sum_of_two_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        adding ob=new adding();
        System.out.println("Do you want to do it again? Press y for yes or n for no !" );
        char bool=sc.next();
        if(bool==y)
        {
            
        }

        int sum=ob.add(a,b);
        System.out.print(sum);

    }
}
