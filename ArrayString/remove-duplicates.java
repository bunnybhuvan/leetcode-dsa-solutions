// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach:
// Use two pointers.
// i -> tracks the position of the last unique element
// j -> scans the array for new elements
// When nums[j] != nums[i], a new unique element is found.
// Move i forward and place nums[j] at position i.
// The final length of the array without duplicates is i + 1.
public int removeDuplicates(int[] nums) {
    int i = 0; // slow pointer
    
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) { // new unique found
            i++;
            nums[i] = nums[j];    // place it at next position
        }
    }
    
    return i + 1; // total unique count
}
