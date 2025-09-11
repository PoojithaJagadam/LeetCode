class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count=0;
        int k=str.length();
        for(int i=0;i<k;i++) {
            if(str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}