import java.util.*;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.size()<=1 && list2.size()<=1){
            System.out.println(list1.get(0)+list2.get(0));
        }
        if(list1.size()==1 || list2.size()==1){
            System.out.println("Not possible");
        }
        else{
        System.out.println((list1.get(list1.size()-2))+list2.get(list2.size()-2));
        }
        // System.out.println("The sum of the second largest numbers from the two matrices are : "+(list1.get(list1.size()))+list2.get(list2.size()));
    }
}
