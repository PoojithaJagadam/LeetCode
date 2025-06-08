class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr=new ArrayList<>();
        int dig=1;
        for(int i=0;i<n;++i) {
            arr.add(dig);
            if(dig*10 <=n) {
                dig*=10;
            }
            else {
                while(dig%10 == 9 || dig>=n) {
                    dig/=10;
                }
            dig++;
            }
        }
        return arr;
    }
}