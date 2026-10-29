class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        long totalSum = 0; // Overflow se bachne ke liye long use kiya
        int maxFreq = 0;

        // Step 2: Sliding Window (right pointer aage badhega)
        for (int right = 0; right < nums.length; right++) {
            totalSum += nums[right];

            // Window size = (right - left + 1)
            // Agar sabhi numbers ko nums[right] banana hai toh total chahiye: window_size * nums[right]
            // Operations needed = (window_size * nums[right]) - totalSum
            while ((long) nums[right] * (right - left + 1) - totalSum > k) {
                totalSum -= nums[left];
                left++; // Window ko left se shrink karo
            }

            // Valid window ki length hi frequency hai
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}