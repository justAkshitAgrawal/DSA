class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, candidates, new ArrayList<>(), ans);

        return ans;
    }

    void helper(int ind, int target, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            if (i > ind && nums[i] == nums[i-1]) continue;
            if (nums[i] > target) break;

            ds.add(nums[i]);
            helper(i + 1, target - nums[i], nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}