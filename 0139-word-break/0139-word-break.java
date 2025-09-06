class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] vis=new boolean[n+1];
        vis[0]=true;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                if(vis[j] && wordDict.contains(s.substring(j,i))) {
                    vis[i]=true;
                    break;
                }
            }
        }
        return vis[n];
    }
}