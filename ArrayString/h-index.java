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
