class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++) {
          
            int prod=nums[i];
            max= Math.max(max, prod);
            for(int j=i+1;j<n;j++) {
                prod  *= nums[j];
                if(prod == 0 ) {
                    prod =1;
                    max= Math.max(max, nums[j]);
                }
                else
                    max= Math.max(prod,max);
                
                
            }
            
        }
        return max;
    }
}