class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> indegree=new HashMap<>();
        Map<String, List<String>> graph=new HashMap<>();
        Set<String> available=new HashSet<>(Arrays.asList(supplies));
        List<String> res=new ArrayList<>();
        for(int i=0;i<recipes.length;i++) {
            String a=recipes[i];
            indegree.put(a, ingredients.get(i).size());
            for(String z: ingredients.get(i)) {
                graph.computeIfAbsent(z, k-> new ArrayList<>()).add(a);
            }
        }
        Queue<String> q=new LinkedList<>(available);
        while(!q.isEmpty()) {
            String item=q.poll();
            if(!graph.containsKey(item)) 
            continue;
            for(String k:graph.get(item)) {
                indegree.put(k,indegree.get(k)-1);
                if(indegree.get(k)==0) {
                    res.add(k);
                    q.add(k);
                }
            }
        }
        return res;
    }
}