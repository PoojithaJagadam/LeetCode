class Solution {
    int mod=(int)1e9+7;
    public long pow(long k,long p) {
        if(p==0) {
            return 1;
        }
        long z=pow(k,p/2);
        if(p%2==0) {
            return (z*z)%mod;
        }
        else {
            return (k*z*z)%mod;
        }
       
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long a=pow(4,odd)%mod;
        long b=pow(5,even)%mod;
        return (int)((a*b)%mod);
    }
}