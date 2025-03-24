class Solution {
    public int countDays(int days, int[][] meetings) {
      int free=0,last=0;
      Arrays.sort(meetings, Comparator.comparingInt(a-> a[0]));
      for(int[] c:meetings) {
        int start=c[0],end=c[1];
        if(start>last+1) {
            free+=start-last-1;
        }
        last=Math.max(last,end);
      }
      free+=days-last;
      return free;
    }

}