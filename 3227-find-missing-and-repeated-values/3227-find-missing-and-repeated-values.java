class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] a=new int[2];
        int n=grid.length;
        HashSet<Integer> hash=new HashSet<>();
        HashSet<Integer> hash2=new HashSet<>();
        for(int i=1;i<=n*n;i++) {
            hash.add(i);
        }
        HashMap<Integer, Integer> hash1=new HashMap<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                hash1.put(grid[i][j], hash1.getOrDefault(grid[i][j],0)+1);
                hash2.add(grid[i][j]);
            }
        }
        for(int i:hash1.keySet()) {
            if(hash1.get(i)>1) {
                a[0]=i;
            }
        }
        
        for(int i:hash) {
            if(!hash2.contains(i)) {
                a[1]=i;
            }
        }
        return a;
    }
}