package Arrays;

import java.util.ArrayList;

public class subarray_sum {
     static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, sum = 0;
        
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            
            // Shrink window from the left if sum exceeds the target
            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }
            
            // Check if sum equals the target
            if (sum == target) {
                result.add(start + 1); 
                result.add(end + 1);  
                return result;
            }
        }
        
        // If no subarray found
        result.add(-1);
        return result;
    }
    
}
