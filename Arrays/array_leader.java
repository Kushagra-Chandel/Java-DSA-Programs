package Arrays;

import java.util.ArrayList;

public class array_leader {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1]; // Rightmost element is always a leader
        result.add(maxFromRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i]; // Update maxFromRight
                result.add(maxFromRight);
            }
        }

        // Reverse the result to maintain original order
        ArrayList<Integer> finalResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            finalResult.add(result.get(i));
        }
        return finalResult;
    }
    
}
