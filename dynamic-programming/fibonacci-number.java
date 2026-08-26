class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        if(n == 0){
            return first;
        }
        for(int i=1;i<n;i++){
            int newsecond = first + second;
            first = second;
            second = newsecond;
        }
        return second;
    }
}