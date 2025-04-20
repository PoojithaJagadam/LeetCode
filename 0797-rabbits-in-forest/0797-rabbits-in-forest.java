class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=answers.length;
        for(int i=0;i<n;i++) {
            hash.put(answers[i],hash.getOrDefault(answers[i],0)+1);
        }
        int sum=0;
        for(int i: hash.keySet()) {
            int t=hash.get(i);
            int size = i+1;
            int a= (int) Math.ceil((double)t/size);
            sum+=a*size;            
        }
        return sum;
    }
}