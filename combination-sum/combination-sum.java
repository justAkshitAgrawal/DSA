class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, target, new ArrayList<>(), candidates, ans);
        return ans;
    }

    public void helper(int ind, int target, List<Integer> ds, int[] candidates, List<List<Integer>> ans) {
        if (ind == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }

            return;
        }

        if (candidates[ind] <= target) {
            ds.add(candidates[ind]);
            helper(ind, target - candidates[ind], ds, candidates, ans);
            ds.remove(ds.size() - 1);
        }

        helper(ind + 1, target, ds, candidates, ans);
    }
}