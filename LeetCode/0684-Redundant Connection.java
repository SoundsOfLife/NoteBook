class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;
        int[] flag = new int[N + 1];
        int[] ans = new int[2];
        for (int i = 0; i < N + 1; i++)
            flag[i] = -1;
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            if (find(flag, u) == find(flag, v)) {
                ans[0] = u;
                ans[1] = v;
                break;
            } else {
                union(flag, u, v);
            }
        }
        return ans;
    }

    public int find(int[] nodes, int x) {
        if (nodes[x] < 0) {
            return x;
        } else {
            nodes[x] = find(nodes, nodes[x]);
            return nodes[x];
        }
    }

    public void union(int[] nodes, int x, int y) {
        int a = find(nodes, x);
        int b = find(nodes, y);
        if (a > b) {
            nodes[a] = b;
        } else {
            nodes[b] = a;
        }
    }
}