class Solution {
    public int removeDuplicates(int[] nums) {

        int[] result = new int[nums.length];

        int k = 0;

        result[0] = nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i] != result[k]){
                result[++k] = nums[i];
            }
        }

        for(int i=0;i<=k;i++){
            nums[i] = result[i];
        }

        return k+1; 


    }
}