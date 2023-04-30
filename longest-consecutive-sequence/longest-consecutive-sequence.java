class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> set = new HashSet<>();
     int ans = 0;
     for (int i : nums) set.add(i);

     for (int num : nums) {
         int left = num - 1;
         int right = num + 1;
         while(set.remove(left)) left--;
         while(set.remove(right)) right++;
         ans = Math.max(ans, right - left - 1);
         if (set.isEmpty()) return ans;
     }

     return ans;
        
    }
}