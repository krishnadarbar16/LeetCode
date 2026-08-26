class Solution {
    public int addDigits(int num) {
        
        int addednum =0;
        if(num%10 == num){
            return num;
        }
        while(num % 10 != num){
            addednum = 0;
            while(num != 0){
                addednum = addednum + (num%10);
                num = num/10;
            }
            
            num = addednum;
            
            
        }
        return addednum;
    }
}