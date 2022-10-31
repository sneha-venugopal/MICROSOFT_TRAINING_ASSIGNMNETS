class Solution {
    public boolean isBipartiteUtil(int[][] graph, int[] color, int node, int parent) {
        color[node] = parent == -1 ? 0 : 1 - color[parent];
        for(int i=0;i<graph[node].length;i++) {
            if(color[graph[node][i]] == -1 ) {
                if( !isBipartiteUtil(graph,color,graph[node][i],node)) return false;
            }
            else if(color[graph[node][i]] == color[node]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        
        for(int i=0;i<graph.length;i++) {
            if(color[i] == -1) {
                if(!isBipartiteUtil(graph,color,i,-1)) return false;
            }
        }
        return true;
    }
}