class Solution {
    public int maxDifference(String s) {
        int n=s.length();
         HashMap<Character, Integer> hash =new HashMap<>();
        // HashMap<Character, Integer> even =new HashMap<>();
        for(int i=0;i<n;i++) {
            char ch=s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(Character i: hash.keySet()){
            if(hash.get(i) !=0 && hash.get(i)%2==0)  {
                even.add(hash.get(i));
            }
            else if(hash.get(i)!=0 && hash.get(i)%2!=0) {
                odd.add(hash.get(i));
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int a= odd.get(odd.size()-1);
        int b= even.get(0);
       //  System.out.println('a'- 'a');   
           // return max;
        return a-b;
    }
}