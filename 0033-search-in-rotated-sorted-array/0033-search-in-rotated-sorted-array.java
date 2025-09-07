class Solution {

    static int binSearch(int[] nums, int low, int high, int key) {
        int l=low,h=high;
        while(l<=h) {
            int mid = l + (h-l)/2;
            if(nums[mid] == key) {
                return mid;
               
            }
            else if(nums[mid] < key) 
                l = mid + 1;
            else
                h = mid - 1;
            
        }
        
        return -1;
    }
    static int findMax(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        int ans=nums[0];
        while(l<h) {
            int mid = l + (h-l)/2;
            if(nums[mid] >= nums[h])
               l=mid+1;
            else
                h=mid;
        }
        //System.out.print();
        return  l;
    }

    public int search(int[] nums, int target) {
        int n=nums.length;
        int maxi = findMax(nums);
        int  num1 = binSearch(nums,0,maxi,target);
        int  num2 = binSearch(nums,maxi+1,n-1,target);
        //System.out.println(maxi + " " +num1 +" "+ num2);
       if(target >= nums[maxi] && target <= nums[n-1]) {
        return  binSearch(nums,maxi,n-1,target);
       }
       else 
        return binSearch(nums,0,maxi-1,target);
    }
   
}