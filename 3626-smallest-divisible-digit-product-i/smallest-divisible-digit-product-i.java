class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
    
    for(int i=n;i<Integer.MAX_VALUE;i++) {
        int start=i;
        int p=1;
        while(start!=0){
            int dig=start%10;
            p*=dig;
            start/=10;
        }
        if(p%t==0){
            ans=i;
            break;
        }
      }
        return ans;
    }
}