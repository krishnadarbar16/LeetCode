class Solution {
    public int reverse(int x) {
        long rev = 0;
        long y = (long)x;
        while(y !=0){
            rev = (rev*10) + (y % 10);
            y = y/10;
        }

        if( rev<2147483648l && (rev > (-2147483648l)) ){
        return (int)rev;
        }
        return 0;
    }
}