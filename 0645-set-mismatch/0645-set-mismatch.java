class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int missing = 1;
        // find missing number:
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == missing) {
                missing++;
            }
        }
        
        // find duplicate number:
        int dup = -1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            }
        }
        
        return new int[]{dup, missing};
    }
}