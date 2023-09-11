import java.util.*;

public class array_to_arraylist {
    public static void func1(int arr[])
    {
        ArrayList<Integer> array_list = 
                new ArrayList<Integer>();
  
        // Using add() method to add elements in array_list
        for (int i = 0; i < arr.length; i++)
            array_list.add((arr[i]));
        System.out.print(array_list);
    }
  
    public static void main(String[] args)
    {
  
        int array[] = { 1, 2, 3, 4, 5 };
        func1(array);
    }
}