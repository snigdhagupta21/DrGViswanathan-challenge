class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];      // Global max
        int currentSum = nums[0];  // Running sum

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at nums[i] or extend current
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum); // Update global max
        }

        return maxSum;
    }
}
