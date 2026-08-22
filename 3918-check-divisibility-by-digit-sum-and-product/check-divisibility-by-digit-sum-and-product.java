class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prosum=1;
        int orig=n;
        while(n!=0){
            int dig=n%10;
            sum+=dig;
            prosum*=dig;
            n/=10;
        }
        if(orig%(sum+prosum)==0){
            return true;
        }
        return false;
    }
}