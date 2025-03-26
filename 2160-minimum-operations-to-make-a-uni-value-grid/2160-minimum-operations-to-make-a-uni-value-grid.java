class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<grid[i].length;j++) {
                arr.add(grid[i][j]);
            } 
        }
        int k=arr.get(0)%x;
        for(int i: arr) {
            if(i%x!=k)
                return -1;
        }
        Collections.sort(arr);
        int median=arr.get(arr.size()/2);
        int count=0;
        for(int i: arr) {
            count+=Math.abs(i-median)/x;
        }
        return count;
    }
}