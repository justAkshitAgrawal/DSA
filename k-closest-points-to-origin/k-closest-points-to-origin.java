class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                (a[0] * a[0] + a[1] * a[1]), (b[0] * b[0] + b[1] * b[1])
            )
        );

        for (int point[] : points) pq.add(point);

        int[][] res = new int[k][2];

        for (int i = 0; i < k; i ++) {
            int[] cur = pq.poll();
            res[i][0] = cur[0];
            res[i][1] = cur[1];
        }

        return res;

    }
}