class Solution {
    public int findKthNumber(int n, int k) {
        int c=1;
        k-=1; 
        while(k>0){
            long p=countSteps(n,c,c+1);
            if(p<=k){
                c++;      
                k-=p;  
            }else{
                c*=10;  
                k-=1;      
            }
        }

        return c;
    }

    private long countSteps(int n,long c,long next){
        long s=0;
        while(c<=n){
            s+=Math.min(n+1,next)-c;
            c*=10;
            next*=10;
        }
        return s;
    }
}