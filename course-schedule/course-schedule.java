class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) list.add(new ArrayList<>());

        for (int i = 0; i < prerequisites.length; i++)
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);

        int indeg[] = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            for (int it : list.get(i)) {
                indeg[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        int i = 0;

        while (!q.isEmpty()) {
            int val = q.peek();
            q.remove();

            topo.add(val);

                for (int it : list.get(val)){
                    indeg[it]--;
                    if (indeg[it] == 0) q.add(it);
                }
        }

        return topo.size() == numCourses;
        
    }
}