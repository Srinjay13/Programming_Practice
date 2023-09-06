import java.util.HashSet;

public class Unique_elements {
    public static void main(String[] args) {
        int[] arr={23,45,82,71};
        int[] arr2={82,71,99,100,108};
        //Using Hashset
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);
        // }
        // for(int i=0;i<arr2.length;i++){
        //     set.add(arr2[i]);
        // }
        // System.out.println(set.size());

        //Using frequency array
        int[] freq=new int[1000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            freq[arr2[i]]++;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
