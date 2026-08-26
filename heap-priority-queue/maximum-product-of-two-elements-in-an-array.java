class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int maxindex = i;
        int max = Integer.MIN_VALUE;

        while(i<=nums.length-1){
            if(nums[i]>=max){
                max = nums[i];
                maxindex = i;
            }
            i++;
        }

        int  j = 0;
        int secondmax = Integer.MIN_VALUE;
        while(j<=nums.length-1){
            if(j == maxindex){
                j++;
                continue;
            }else if(nums[j]>=secondmax){
                secondmax =nums[j];
            }
            j++;
        }

        return (max-1)*(secondmax-1);
    }
}