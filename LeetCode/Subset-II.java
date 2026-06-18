class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);


        solve(0, nums, ds, ans);

        return ans;
    }

    private void solve(int index, int[] nums,
                       List<Integer> ds,
                       List<List<Integer>> ans) {

        ans.add(new ArrayList<>(ds));

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            ds.add(nums[i]);

            solve(i + 1, nums, ds, ans);

            ds.remove(ds.size() - 1);
        }
    }
}
