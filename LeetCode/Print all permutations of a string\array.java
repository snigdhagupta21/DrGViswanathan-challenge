class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        func(0,nums,ans);
        return ans;
    }
    public void func(int index,int nums[],List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i:nums){
                list.add(i);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=index;j<nums.length;j++){
            swap(j,index,nums);
            func(index+1,nums,ans);
            swap(j,index,nums);
        }
    }
    public void swap(int start,int end,int nums[]){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
