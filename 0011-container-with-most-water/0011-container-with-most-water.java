class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int p1=0,p2=n-1;
        int max=0;
        while(p1<=p2) {
           int min_ele=Math.min(height[p1], height[p2]);
           int width= p2-p1;
            max=Math.max(max,min_ele*width);
            if(height[p1] < height[p2]) 
                p1++;
            else
                p2--;
        }
        return max;
    }
}