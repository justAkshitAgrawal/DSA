class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();

        int start = intervals[0][0], end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            if (s <= end) {
                end = Math.max(end, e);
            } else {
                result.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][2]); 
    }
}