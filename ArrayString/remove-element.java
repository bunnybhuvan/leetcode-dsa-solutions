// Problem: Remove Element
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach:
// Use two pointers.
// i -> scans the array
// k -> places valid elements (not equal to val)
// When nums[i] != val, move it to position k.
class Solution {
    public int removeElement(int[] nums, int val) {
    int k = 0; // placer pointer
    
    for (int i = 0; i < nums.length; i++) { // scanner
        if (nums[i] != val) {               // valid?
            nums[k] = nums[i];              // place it
            k++;                            // move placer
        }
    }
    
    return k;
}
}

   
