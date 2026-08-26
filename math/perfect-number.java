class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int sum = 0;
        int temp = num;

        if(temp==1){
            return false;
        }
        
        for(int i=2;i*i<=temp;i++){
        
            if(temp%i == 0){
                
                int firstfactor = i;
                int secondfactor = temp/i;
                sum = sum + firstfactor;
                
                if(firstfactor != secondfactor){
                sum = sum+secondfactor;
                }
                
            }
        }

        if(sum+1==num){
            return true;
        }
        return false;

    }
}