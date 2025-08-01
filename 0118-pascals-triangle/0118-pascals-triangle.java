class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        arr.add(temp);
        for(int i=1;i<numRows;i++) {
            List<Integer> a=new ArrayList<>();
            a.add(1);
            for(int j=1;j<i;j++) {
                int sum= arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                a.add(sum);
            }
            a.add(1);
            arr.add(a);
        }

        
        return arr;
    }
}