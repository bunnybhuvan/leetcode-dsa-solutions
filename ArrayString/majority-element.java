// Problem: Majority Element
// Platform: LeetCode
// Pattern: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

// Description:
// Given an array nums of size n, find the majority element.
// The majority element is the element that appears more than ⌊n/2⌋ times.
// You may assume that the majority element always exists in the array.

// Approach:
// Use the Boyer-Moore Voting Algorithm.
// Maintain a candidate and a counter.
// Traverse the array:
// - If count becomes 0, select the current element as the new candidate.
// - If the current element equals the candidate, increase the count.
// - Otherwise decrease the count.
// At the end, the candidate will be the majority element.
class Solution {
    public int majorityElement(int[] nums) {
          int candidate = 0;
    int count = 0;
    
    for (int num : nums) {
        if (count == 0) {
            candidate = num;   // New candidate
        }
        count += (num == candidate) ? 1 : -1;
    }
    
    return candidate;
        
    }
}
