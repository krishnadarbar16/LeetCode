class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_dig_sum = 0;
        int double_dig_sum = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] %10 == nums[i]){
                single_dig_sum += nums[i];
            }else{
                double_dig_sum += nums[i];
            }
        }

        if(single_dig_sum != double_dig_sum){
            return true;
        }

        return false;
    }
}