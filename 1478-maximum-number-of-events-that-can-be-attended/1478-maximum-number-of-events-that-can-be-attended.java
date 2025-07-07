class Solution {
    public int maxEvents(int[][] events) {
        int n=events.length;
        int c=0;
        int maxDay = 0;
        // first manam maximum enni events attend avtham ani plan cheskovali dhaani kosam endday lo max kanukkunte daripothadhi
        for(int[] e: events) {
            maxDay = Math.max(maxDay, e[1]);
        }
        // next manam maximum events attend avvali anukuntam so for that we have to choose the evnts which will end at as minimum days as possible
        // so dhaani kosam first manam startday tho sort cheskovali and below is the expression
        //This is lamda function used to sort 2d arrays
        Arrays.sort(events, (a,b) -> a[0]- b[0]);

        //to pick min days first we choose priorityQueue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int j=0;
        for(int i=1;i<=maxDay;++i) {

            // manam before days attend avvaka miss ayina events ni remove cheyali
            while(!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }

            // now current day nundi enni events attend avthadho queue lo add chyeli
            while(j < n && events[j][0] <= i) {
                pq.add(events[j][1]);
                j++;
            }

            // and events min endday unnavi attend avtham kabatti valltini remove chesi count increment cheyali
            if(!pq.isEmpty()) {
                pq.poll();
                c++;
            }

        }
        return c;
    }
}