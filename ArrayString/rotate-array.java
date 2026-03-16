// Problem: Rotate Array
// Platform: LeetCode
// Pattern: Array Manipulation / Reversal
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given an integer array nums, rotate the array to the right by k steps,
// where k is non-negative.

// Approach:
// Use the reverse method to rotate the array in-place.
// Step 1: Reverse the entire array.
// Step 2: Reverse the first k elements.
// Step 3: Reverse the remaining elements.
// This effectively shifts the array to the right by k positions.class Solution { 
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // wrap around handle

        reverse(nums, 0, n - 1);   // Step 1
        reverse(nums, 0, k - 1);   // Step 2
        reverse(nums, k, n - 1);   // Step 3
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}