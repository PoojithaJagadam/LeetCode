class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        int n1=a.length()-1;
        int n2=b.length()-1; 
        int c=0;
        while(n1>=0 || n2>=0 || c==1) {
            if(n1>=0) {
                c+=a.charAt(n1--)-'0'; 
            }
            if(n2>=0)
                c+=b.charAt(n2--)-'0';
            str.append(c%2);
            c/=2;
        }
       // str.append(c);
       return str.reverse().toString();
    }
}