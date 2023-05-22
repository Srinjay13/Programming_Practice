import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Print_all_Permutations {
    public static ArrayList<ArrayList<Character>> ans=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string whose permutation you want to find: ");
        String str=sc.next();
        char[] arr=str.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        int[] map=new int[str.length()];
        perm(arr,list,ans,map);
        // permute(list,map,arr,ans);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        
    }
    public static void perm(char[] arr,ArrayList<Character> list,ArrayList<ArrayList<Character>> ans,int[] map){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(map[i]!=1){
                map[i]=1;
                list.add(arr[i]);
                
                perm(arr,list,ans,map);
                list.remove(list.size()-1);
                map[i]=0;
            }
        }
    }
    public static void permute(ArrayList<Character> ds,int[] map,char []a,ArrayList<ArrayList<Character>> ans){

        if(ds.size() == a.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<a.length;i++){
            if(map[i] == 0){
                map[i] = 1;
                ds.add(a[i]);
                permute(ds,map,a,ans);
                ds.remove(ds.size()-1);
                map[i] = 0;
            }
        }
    }
}
