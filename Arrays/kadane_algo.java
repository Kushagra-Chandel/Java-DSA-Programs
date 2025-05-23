package Arrays;

public class kadane_algo {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        
        for(int num : arr){
            currentSum +=num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if (currentSum <0){
                currentSum =0;
            }
        }
        return maxSum;
    }
    
}
