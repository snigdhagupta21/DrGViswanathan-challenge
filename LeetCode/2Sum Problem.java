class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int nextnumber=target-nums[i];
            if(map.containsKey(nextnumber)){
                return new int[] {map.get(nextnumber),i};
            }
            map.put(nums[i],i);
        }
        return new int[-1];
    }
}
