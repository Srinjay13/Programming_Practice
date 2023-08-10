/*
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/


public class MajorityElement {
    public static void main(String[] args) {
        /*
        class Solution {
            public int majorityElement(int[] arr) {
                int [] fr = new int [arr.length];  
                int visited = -1;  
                for(int i = 0; i < arr.length; i++){  
                    int count = 1;  
                    for(int j = i+1; j < arr.length; j++){  
                        if(arr[i] == arr[j]){  
                            count++;  
                            To avoid counting same element again  
                            fr[j] = visited;  
                        }  
                    }  
                    if(fr[i] != visited)  
                        fr[i] = count;  
                }  
                for(int i=0;i<fr.length;i++)
                {
                    if(fr[i]>arr.length/2)
                        return arr[i];
                }
                return -1;


                BEST SOLUTION
                int count=0;
                int candidate=0;
                for(int num:arr)
                {
                    if(count ==0)
                    {
                        candidate=num;
                    }
                    if(candidate ==num)
                    {
                        count+=1;
                    }
                    else 
                    {
                        count-=1;
                    }
                }
                return candidate;


                int ans=1,ind=0;
                Arrays.sort(arr);
                for(int i=0;i<arr.length-1;i++){
                    if(arr[i]==arr[i+1]){
                        ind=i;
                        ans++;
                        continue;
                    }
                }
                if(ans>=(arr.length/2)){
                    return arr[ind];
                }
                return -1;
            }
        }
        */
    }
}
