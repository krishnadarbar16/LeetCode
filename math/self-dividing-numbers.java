class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> arrls = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(dividing(i) == true){
                arrls.add(i);
            }
            
        }

        return arrls;
        
    }

    static boolean dividing(int n){
        int temp = n;

        if(temp==0){
            return false;
        }
        while(temp!=0){
            int digit = temp%10;
            if(digit == 0){
                return false;
            }
            if(n%digit != 0 ){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}