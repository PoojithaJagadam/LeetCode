class Solution {
    public int maximum69Number (int num) {
       String str= Integer.toString(num);
      /* int idx=-1;
       for(int i=0;i<str.length();i++) {
            if(str.charAt(i) ==  '6') {
                idx=i;
                break;
            }
       }
       String ans="";
       if(idx !=-1)
         ans= str.substring(0,idx) + '9'+ str.substring(idx+1,str.length());
       //System.out.print(String.valueOf(ans));

       return idx == -1 ? num : Integer.parseInt(ans); */

       str=str.replaceFirst("6","9");
       return Integer.parseInt(str);

    }
}