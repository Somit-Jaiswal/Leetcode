class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff) != i){
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
        }
        return result;
        
    }
}