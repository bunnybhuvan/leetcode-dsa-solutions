// Problem: Jump Game
// Platform: LeetCode
// Pattern: Greedy / Array
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given an array nums where each element represents your maximum jump length
// at that position, determine if you can reach the last index starting from
// the first index.

// Approach:
// Use a greedy strategy to track the maximum index reachable.
// Traverse the array:
// - If the current index is beyond maxReach, we cannot proceed → return false.
// - Otherwise, update maxReach = max(maxReach, i + nums[i]).
// If we complete the loop, the last index is reachable.
class Solution {
   public boolean canJump(int[] nums) {
    int maxReach = 0;                          // Max index reach avvachu
    
    for (int i = 0; i < nums.length; i++) {
        if (i > maxReach) return false;        // Stuck position
        maxReach = Math.max(maxReach, i + nums[i]);  // Greedy update
    }
    
    return true;                               // Last index reachable
}
}
