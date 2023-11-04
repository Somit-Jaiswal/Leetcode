class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int min = n;
        int max = 0;
        int maxLeft = 0;
        int minRight = n;
        for(int e: left) {
            maxLeft = Math.max(maxLeft, e);
        }
        for(int e: right) {
            minRight = Math.min(minRight, e);
        }
        for(int e: left) {
            if(e < minRight) continue;
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        for(int e: right) {
            if(e > maxLeft) continue;
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        return maxLeft < minRight ? Math.max(maxLeft, n - minRight): Math.max(n - min, max);
    }
}