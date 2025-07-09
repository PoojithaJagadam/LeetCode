class Solution {
    public boolean checkInclusion(String s1, String s2) {

        
        if(s1.length() >s2.length())
            return false;
        
        int[] hash1=new int[26];
        int[] hash2=new int[26];

        int n1=s1.length();
        int n2=s2.length();

        //first window size i.e s1.length() varak characters frequencies ni count cheyali using count array

        for(int i=0;i<n1;i++) {
            hash1[s1.charAt(i) - 'a']++;
            hash2[s2.charAt(i) - 'a']++;
        }

        // starting lo ne arrays equal ayithe akkade return cheyseyali
        if(Arrays.equals(hash1, hash2))
            return true;

        // if not then proceed like this
        // first manaki ocche character frequencies ni count cheyali
        // next window size lo leni elemnets frequencies remove cheyali

        for(int i=n1;i<n2;i++) {
            hash2[s2.charAt(i)- 'a']++;
            hash2[s2.charAt(i- n1) - 'a']--;

            // equal ayithe return
            if(Arrays.equals(hash1,hash2))
                return true;
        }

        return false;
    }
}