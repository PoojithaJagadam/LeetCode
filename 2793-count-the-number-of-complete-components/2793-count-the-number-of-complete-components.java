class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph=new ArrayList[n];
        Map<List<Integer>,Integer> hash=new HashMap<>();
        // Vertices
        for(int i=0;i<n;i++) {
            graph[i]=new ArrayList<>();
            graph[i].add(i);
        }
        // Edges
        for(int[] edge:edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        for(int i=0;i<n;i++) {
            List<Integer> neighbors=graph[i];
            Collections.sort(neighbors);
            hash.put(neighbors,hash.getOrDefault(neighbors,0)+1);
        }
        int count=0;
        for(List<Integer> i:hash.keySet()) {
            if(i.size()==hash.get(i)) {
                count++;
            }
        }
        return count;
    }
}