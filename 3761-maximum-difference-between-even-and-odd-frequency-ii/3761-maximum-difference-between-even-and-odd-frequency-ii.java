class Solution {
    public int getStatus(int c1,int c2) {
        return ((c1 & 1)<<1) | (c2 &1);
    }
    public int maxDifference(String s, int key) {
        int n=s.length();
        int ans= Integer.MIN_VALUE;
        for(char i='0';i<='4';i++) {
            for(char j='0'; j <= '4';j++) {
                if(i==j)
                    continue;
                int[] best=new int[4];
                Arrays.fill(best, Integer.MAX_VALUE);
                int c1=0,c2=0;
                int p1=0, p2=0;
                int left = -1;
                for(int k=0;k<n;k++) {
                    c1+=(s.charAt(k) == i? 1:0);
                    c2+=(s.charAt(k) ==j ? 1:0);
                    while(k-left >=key && c2-p2>=2) {
                        int left_status =getStatus(p1,p2);
                        best[left_status]=Math.min(best[left_status], p1-p2);
                        left++;
                        p1+=(s.charAt(left) == i?1 :0);
                        p2+=(s.charAt(left) ==j?1:0);
                    }
                    int right_status= getStatus(c1,c2);
                    if(best[right_status ^ 0b10] !=Integer.MAX_VALUE) {
                        ans=Math.max(ans, c1-c2- best[right_status ^ 0b10]);
                    }
                }
            }
        }
        return ans;
    }
}