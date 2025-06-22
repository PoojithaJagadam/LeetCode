class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=0;
        int n=sentences.length;
        for(int i=0;i<n;i++) {
            int c=0;
            for(int j=0;j<sentences[i].length();j++) {
                if(sentences[i].charAt(j)==' ')
                    c++;
            }
            maxi=Math.max(c+1,maxi);
        }
        return maxi;
    }
}