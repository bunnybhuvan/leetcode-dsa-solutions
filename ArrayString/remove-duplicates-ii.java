// Problem: Remove Duplicates from Sorted Array II
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given a sorted array nums, remove duplicates in-place such that each
// element appears at most twice. The relative order of elements should
// remain the same. Return the length of the modified array (k).
// The first k elements of nums should contain the allowed values.

// Approach:
// Use a write pointer (k) to place valid elements.
// Traverse each number in the array.
// If we have placed fewer than two elements, allow it.
// Otherwise check if the current number is different from nums[k-2].
// If it is different, place it at nums[k] and move the pointer forward.

class Solution {
    public int removeDuplicates(int[] nums) {
        
    int k = 0;  // write pointer

    for (int num : nums) {
        if (k < 2 || num != nums[k - 2]) {
            nums[k] = num;
            k++;
        }
    }

    return k;
}
}