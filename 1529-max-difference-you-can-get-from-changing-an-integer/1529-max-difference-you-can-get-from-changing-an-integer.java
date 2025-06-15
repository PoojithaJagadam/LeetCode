class Solution {
    public int maxDiff(int num) {
        String str=Integer.toString(num);
        String s=str;
        String t=str;
        String a="";
        String b="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!='9') {
                a=s.replace(s.charAt(i),'9');
                break;
            }
            else 
                a=s;
        }
        if(t.charAt(0) != '1') {
            b=t.replace(t.charAt(0), '1');
        }
        else {
            for(int i=1;i<t.length();i++) {
                if(t.charAt(i)!='0' && t.charAt(i)!=t.charAt(0)) {
                    b=t.replace(t.charAt(i),'0');
                    break;
                }
                else {
                    b=t;
                }
            }
        }
        //System.out.print(Integer.parseInt(s) +" "+Integer.parseInt(t));
        return Integer.parseInt(a) - Integer.parseInt(b);

    }
}