class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while(temp!=0){
            int last = temp%10;
            sum += last;
            product *= last;
            temp = temp/10;
        }
        int num = sum + product;

        if(n%num == 0){
            return true;
        }
        return false;
    }
}