package Arrays;

import java.util.PriorityQueue;

public class kth_small {
    public static int kthSmallest(int[] arr, int k) {
        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add all elements to the heap
        for (int num : arr) {
            minHeap.add(num);
        }
        
        // Remove (k - 1) smallest elements
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        // kth smallest element will now be at top
        return minHeap.peek();
    }
    
}
