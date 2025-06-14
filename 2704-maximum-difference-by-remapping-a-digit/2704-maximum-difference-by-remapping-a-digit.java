class Solution {

    public int minMaxDifference(int num) {
       String str = Integer.toString(num);
       String t=str;
       String s1=str;
       for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!='9') {
                s1=s1.replace(s1.charAt(i), '9');
                break;
            }
            else {
                s1=str;
            }
           
       }
       for(int i=0;i<t.length();i++) {
            if(t.charAt(i)!='0') {
            t=t.replace(t.charAt(i), '0');
                break;
            }
            else {
             t=str;
            }
           
       }
       return Integer.parseInt(s1) - Integer.parseInt(t);
       
    }
}