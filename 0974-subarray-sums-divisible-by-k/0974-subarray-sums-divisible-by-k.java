class Solution {
    public int subarraysDivByK(int[] nums, int K) {
     Map<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        int prefix=0,res=0;
        for(int num:nums){
            prefix = (prefix + num % K + K) % K;
            res += freq.getOrDefault(prefix, 0);
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }  
        return res;
    }
}