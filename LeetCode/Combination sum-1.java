class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(0,target,candidates,list,ans);
        return ans;
    }
    public void func(int index,int target, int candidates[], List<Integer> list, List<List<Integer>> ans){
        if(index == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            func(index,target-candidates[index],candidates,list,ans);
            list.remove(list.size()-1);
        }
        func(index+1,target,candidates,list,ans);
    }
}
