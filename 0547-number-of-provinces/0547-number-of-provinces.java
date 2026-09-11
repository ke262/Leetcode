class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int src) {
        visited[src] = true;

        for (int nbr = 0; nbr < isConnected.length; nbr++) {
            if (isConnected[src][nbr] == 1 && !visited[nbr]) {
                dfs(isConnected, visited, nbr);
            }
        }
    }
}