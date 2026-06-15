class Solution {

    static int find(int x, int[] parent) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x], parent);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        ArrayList<int[]> jobs = new ArrayList<>();

        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{deadline[i], profit[i]});
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        jobs.sort((a, b) -> b[1] - a[1]);

        int[] parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int countJobs = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {

            int deadlineSlot = find(job[0], parent);

            if (deadlineSlot > 0) {

                countJobs++;
                totalProfit += job[1];

                parent[deadlineSlot] =
                        find(deadlineSlot - 1, parent);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(countJobs);
        ans.add(totalProfit);

        return ans;
    }
}
