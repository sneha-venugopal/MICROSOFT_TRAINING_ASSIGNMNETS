class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(Integer node : adj.get(i))
                indegree[node]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        
        ArrayList<Integer> sorted = new ArrayList<>();
        while(!q.isEmpty()){
            Integer currNode = q.poll();
            sorted.add(currNode);
            for(Integer node : adj.get(currNode)){
                indegree[node]--;
                if(indegree[node]==0)
                    q.add(node);
            }
        }
        
        if(sorted.size() != numCourses)
            return new int[0];
        int arr[] = new int[sorted.size()]; 
        for(int i=0;i<sorted.size();i++)
            arr[i] = sorted.get(i);
        return arr;
    }
}
