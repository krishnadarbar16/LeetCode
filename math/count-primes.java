class Solution {

    public int countPrimes(int n) {
        int primecount = 0;

        if(n<=2){
        return primecount;
        }

        boolean[] prime = new boolean[n+1];

        for(int i=0;i<n+1;i++){
            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for(int p=2;p*p<=n;p++){
            if(prime[p]){
                for(int j=p*p;j<=n;j+=p){
                prime[j] = false;
                }
            }
            
        }

        for(int k=0;k<n;k++){
            if(prime[k]){
                primecount++;
            }
        }

        return primecount;
    }
}