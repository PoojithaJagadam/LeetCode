class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            int diff=-1;
            for(int j=i+1;j<n;j++) {
                if(prices[j]<=prices[i]) {
                    diff=prices[i]-prices[j];
                    break;
                }
            }
            if(diff!=-1) 
            a[i]=diff;
            else {
                a[i]=prices[i];
            }
        }
        return a;
    }
}