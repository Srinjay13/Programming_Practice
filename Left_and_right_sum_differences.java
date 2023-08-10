import java.util.Arrays;

public class Left_and_right_sum_differences {
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        // System.out.println(numsays.toString(left));
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        // System.out.println(Arrays.toString(right));
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(right[i]-left[i]);
        }
        System.out.println(Arrays.toString(ans));

        //Best solution in time complexity : O(N) and space complexity : O(1)
        /*int leftSum = 0, rightSum = 0;
        for(int n : nums) rightSum += n;
        for(int i = 0; i < nums.length; i ++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            nums[i] = Math.abs((leftSum - nums[i]) - rightSum);
        } 
        return nums;*/
    }
}
