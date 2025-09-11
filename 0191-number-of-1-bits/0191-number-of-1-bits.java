class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count=0;
        for(char i: str.toCharArray()) {
            if(i == '1')
                count++;
        }
        return count;
    }
}