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