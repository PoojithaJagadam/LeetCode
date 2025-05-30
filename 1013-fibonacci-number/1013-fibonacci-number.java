class Solution {
    
    public int fib(int n) {
       
        int c=0,p1=0,p2=1;
        for(int i=2;i<=n;i++) {
            c= p1+p2;
            p1=p2;
            p2=c;
        }
        return (n==0)? 0:p2;
    }
}