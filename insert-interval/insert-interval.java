class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;

        while ( i < intervals.length && intervals[i][1] < newInterval[0]) {
                ans.add(intervals[i++]);
        }

        while ( i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval = new int[] {
                Math.min(newInterval[0], intervals[i][0]),
                Math.max(newInterval[1], intervals[i][1])
            };
            i++;
        }

        ans.add(newInterval);

        while ( i < intervals.length) ans.add(intervals[i++]);

        int[][] mergedIntervals = new int[ans.size()][2];

        for (int j = 0; j < ans.size(); j++) {
            mergedIntervals[j] = ans.get(j);
        }

        return mergedIntervals;
    }
}