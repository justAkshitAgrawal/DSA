class Solution {
    public int missingNumber(int[] nums) {
        int ans = -1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                ans = i;
                break;
            }
        }

        return ans == -1 ? nums.length : ans;
    }
}