class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        func(0,target,candidates,ans,list);
        return ans;
    }
    public void func(int index,int target,int candidates[],List<List<Integer>> ans, List<Integer> list){
        
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if (i > index &&
                candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i]>target){
              break;
            }
            
            list.add(candidates[i]);
            func(i+1,target-candidates[i],candidates,ans,list);
            list.remove(list.size()-1);
            
        }
    }
}
