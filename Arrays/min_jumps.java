package Arrays;

public class min_jumps {
    static int minJumps(int[] arr) {
        int n = arr.length;

        // If there's only one element, no jumps needed.
        if (n == 1) return 0;

        // If the first element is 0, we can't move.
        if (arr[0] == 0) return -1;

        int maxReach = arr[0]; // Maximum index reachable
        int steps = arr[0];    // Steps left for the current jump
        int jumps = 1;         // Number of jumps taken

        for (int i = 1; i < n; i++) {
            // If we reached the last index, return jumps
            if (i == n - 1) return jumps;

            // Update the farthest we can reach
            maxReach = Math.max(maxReach, i + arr[i]);

            steps--; // Use one step

            // If no steps left
            if (steps == 0) {
                jumps++; // Take a new jump

                // If we can't move forward, return -1
                if (i >= maxReach) return -1;

                // Reset steps for the new jump
                steps = maxReach - i;
            }
        }

        return -1; // If end is never reached
    }
}

