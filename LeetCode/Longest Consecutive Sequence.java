class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int longest=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int x=num;
                int count=1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
