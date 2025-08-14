class Solution {
    public String largestGoodInteger(String num) {
       /* int n=num.length();
        String ans="0";
        for(int i=0;i<n-2;i++) {
            String k=num.substring(i,i+3);
            HashSet<Character> hash=new HashSet<>();
            for(int j=0;j<3;j++) {
                hash.add(k.charAt(j));
            }
            if(hash.size() ==1) {
                if(Integer.parseInt(ans) <= Integer.parseInt(k)) {
                    ans= k;
                }
            }
        }
        return ans.equals("0")? "" :ans; */

        String[] nums={"999","888","777","666","555","444","333","222","111","000"};
        for(String i : nums) {
            if(num.contains(i))
                return i;
        }
        return "";
    }
}