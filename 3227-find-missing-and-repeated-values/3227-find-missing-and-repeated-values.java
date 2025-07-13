class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int miss=-1,repeat=-1;
        int n=grid.length;
        int[] freq=new int[n*n+1];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int num=grid[i][j];
                freq[num]++;
            }
        }
        int size=freq.length;
        for(int i=1;i<size;i++) {
            if(freq[i]==2) {
                repeat=i;
               
            }
            else if(freq[i]==0) {
                miss=i;
                
            }

        }
        
        return new int[]{repeat,miss};
    }
}