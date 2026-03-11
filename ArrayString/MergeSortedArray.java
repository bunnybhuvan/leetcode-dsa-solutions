// Problem: Merge Sorted Array
// Platform: LeetCode
// Pattern: Two Pointers
// Time Complexity: O(m + n)
// Space Complexity: O(1)

// Approach:
// Start comparing elements from the end of both arrays.
// Place the larger element at the last position of nums1.
// Continue until all elements are merged.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
    int i = m - 1;       // Last real element of nums1
    int j = n - 1;       // Last element of nums2
    int k = m + n - 1;   // Last position in nums1
    
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }
    
    // Copy remaining nums2 elements
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
    }
}

