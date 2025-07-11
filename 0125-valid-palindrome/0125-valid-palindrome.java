class Solution {
    public boolean isPalindrome(String s) {
       String str= s.replaceAll("[^a-zA-Z0-9\\s]","").toLowerCase();
       int n=str.length();
       StringBuilder str1=new StringBuilder();
       for(int i=0;i<n;i++) {
            if(str.charAt(i)!= ' ')
                str1.append(str.charAt(i));
       }
      // System.out.println(str1.toString());
       String str3=str1.toString();
       String str2= str1.reverse().toString();
       return str3.equals(str2);
    }
}