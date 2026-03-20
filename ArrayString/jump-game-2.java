class Solution {
    public int jump(int[] nums) {
    int jumps = 0;
    int curEnd = 0;
    int farthest = 0;

    for (int i = 0; i < nums.length - 1; i++) {
        // Track farthest reachable index
        farthest = Math.max(farthest, i + nums[i]);

        // End of current window → take a jump
        if (i == curEnd) {
            jumps++;
            curEnd = farthest;

            // Early exit if already can reach end
            if (curEnd >= nums.length - 1) break;
        }
    }

    return jumps;
}
}