class Solution {
    public int maxEvents(int[][] events) {
        int n=events.length;
        int c=0;
        //This is lamda function used to sort 2d arrays
        Arrays.sort(events, (a,b) -> a[0]- b[0]);
        int maxDay = 0;
        for(int[] e: events) {
            maxDay = Math.max(maxDay, e[1]);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int j=0;
        for(int i=1;i<=maxDay;++i) {

            while(!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }

            while(j < n && events[j][0] <= i) {
                pq.add(events[j][1]);
                j++;
            }

            if(!pq.isEmpty()) {
                pq.poll();
                c++;
            }

        }
        return c;
    }
}