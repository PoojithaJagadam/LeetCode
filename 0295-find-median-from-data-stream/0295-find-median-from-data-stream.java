import java.util.*;

class MedianFinder {
    
    public PriorityQueue<Integer> maxHeap;
    public PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if(minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()) 
            return (minHeap.peek() + maxHeap.peek())/ 2.0;
        else 
            return maxHeap.peek();
    }
    
}
