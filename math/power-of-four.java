class Solution {
    public boolean isPowerOfFour(int n) {
        int y=4;
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }

        while(n%y==0){
            n = n/y;
        }
        
        return n == 1;

    }
}