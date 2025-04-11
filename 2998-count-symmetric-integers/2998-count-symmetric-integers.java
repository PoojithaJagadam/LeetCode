class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++) {
            String str=Integer.toString(i);
            int n=str.length();
            int sum1=0,sum2=0;
            if(n%2==0) {
                int mid=n/2;
                for(int j=0;j<mid;j++) {
                    sum1+=str.charAt(j)-'0';
                    sum2+=str.charAt(j+mid)-'0';
                }
               
                if(sum1==sum2) {
                    count++;
                }
            }
            else {
                continue;
            }
        }
        return count;
    }
}