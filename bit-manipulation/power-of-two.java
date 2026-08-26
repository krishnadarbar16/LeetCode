class Solution {
    public boolean isPowerOfTwo(int n) {
        int y=2;
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }

        while(n%2 == 0){
            n=n/y;
        }
        return n==1;
    }
}