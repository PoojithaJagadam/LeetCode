class Solution {
    public int maxProfit(int[] prices) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++) {
            mini=Math.min(mini,prices[i]);
            maxi=Math.max(maxi, prices[i]-mini);
        }
        return maxi;
    }
}