class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max= Math.max(max*nums[i],nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            ans=Math.max(max,ans);
        }
        return ans;
    }
}
