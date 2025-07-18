class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int size=m+n;
       int[] c=new int[size+1];
    //    using two pointer
    // in this we use extra space of size m+n 
       int p1=0, p2=0;
       int k=0;
       while(p1 < m && p2<n) {
            if(nums1[p1] <= nums2[p2]) {
                c[k++]=nums1[p1++];
            }
            else {
                c[k++]= nums2[p2++];
            }
       }
       while(p1<m) {
            c[k++]= nums1[p1++];
       }
       while(p2<n) {
        c[k++] = nums2[p2++];
       }

       for(int i=0;i<size;i++) {
            nums1[i]= c[i];
       }
    }
}