class Solution {
    public class Pack{
        int val;
        int i;
        int j;
        public Pack(int val, int i, int j){
            this.val = val;
            this.i = i;
            this.j = j;
        }
    }
    public class packComparator implements Comparator<Pack>{
        @Override
        public int compare(Pack o1, Pack o2) {
            return Integer.compare(o1.val, o2.val);
        }
    }

    PriorityQueue<Pack> pri = new PriorityQueue<>(new packComparator());
    public int[] maxPoints(int[][] grid, int[] queries) {
        int len = queries.length;
        int[] copyQue = Arrays.copyOf(queries, len);
        Arrays.sort(copyQue);
        HashMap<Integer, Integer> collect = new HashMap<>();

        Pack p1 = new Pack(grid[0][0], 0, 0);
        pri.add(p1);
        int count = 0;

        for(int que: copyQue){
            if(!collect.containsKey(que)){

                while(!pri.isEmpty()){
                    Pack temp = pri.peek();
                    int val = temp.val;
                    int i = temp.i;
                    int j = temp.j;
                    if(grid[i][j] == -1){
                        pri.remove();
                        continue;
                    }

                    if(que > val){
                        int cnt = dfs(grid, i, j, que)+1;
                        count += cnt;
                        pri.remove();
                    }
                    else{
                        break;
                    }
                }
                collect.put(que, count);
            }
        }
        int[] ans = new int[len];
        for(int i = 0;i < len;i++){
            ans[i] = collect.get(queries[i]);
        }
        return ans;
    }

    public int dfs(int[][] grid, int i, int j, int val){
        int count = 0;
        grid[i][j] = -1;
        if(i-1 >= 0 && grid[i-1][j] != -1){
            if(grid[i-1][j] < val){
                count += (dfs(grid, i-1, j, val)+1);
            }
            else{
                Pack temp = new Pack(grid[i-1][j], i-1, j);
                pri.add(temp);
            }
        }
        if(i+1 < grid.length && grid[i+1][j] != -1){
            if(grid[i+1][j] < val){
                count += (dfs(grid, i+1, j, val)+1);
            }
            else{
                Pack temp = new Pack(grid[i+1][j], i+1, j);
                pri.add(temp);
            }
        }
        if(j-1 >= 0 && grid[i][j-1] != -1){
            if(grid[i][j-1] < val){
                count += (dfs(grid, i, j-1, val)+1);
            }
            else{
                Pack temp = new Pack(grid[i][j-1], i, j-1);
                pri.add(temp);
            }
        }
        if(j+1 < grid[0].length && grid[i][j+1] != -1){
            if(grid[i][j+1] < val){
                count += (dfs(grid, i, j+1, val)+1);
            }
            else{
                Pack temp = new Pack(grid[i][j+1], i, j+1);
                pri.add(temp);
            }
        }
        return count;
    }
}