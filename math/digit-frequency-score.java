class Solution {
    public int digitFrequencyScore(int n) {
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int d = temp%10;
            sum = sum+d;
            temp=temp/10;
        }

        return sum;
    }

    
}