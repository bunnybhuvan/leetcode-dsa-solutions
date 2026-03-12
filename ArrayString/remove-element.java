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
   