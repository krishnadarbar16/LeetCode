class Solution {
    public int smallestIndex(int[] nums) {

        for(int i =0;i<nums.length;i++){
            if(i == SumOfDigits(nums[i])){
                return i;
            }
        }
        return -1;
    }

    static int SumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n%10;
            n=n/10;
        }
        return sum;
    }
}