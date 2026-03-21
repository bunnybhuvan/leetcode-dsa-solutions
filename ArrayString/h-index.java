// Problem: H-Index
// Platform: LeetCode
// Pattern: Array / Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

// Description:
// Given an array citations where citations[i] is the number of citations
// for a researcher’s ith paper, return the researcher's h-index.
// The h-index is defined as the maximum value h such that the researcher
// has at least h papers with at least h citations each.

// Approach:
// First sort the array in ascending order.
// Traverse from the largest citation to the smallest.
// For each position i, check if citations[n - 1 - i] >= i + 1.
// If true, update h = i + 1.
// Stop when the condition fails.
// The final h value is the maximum valid h-index.

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        
        // Step 2: Reversed traverse (largest first)
        for (int i = 0; i < n; i++) {
            
            if (citations[n - 1 - i] >= i + 1) {
                h = i + 1;
            } else {
                break;
            }
        }
        return h;
    }
}
