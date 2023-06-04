import java.util.*;

public class TopologicalSort {
    static Stack<Integer> stack = new Stack<>();
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[], int n){
        for(int i = 0; i<n; i++ ){
            graph[i]= new ArrayList<Edge>();
        }
        graph[4].add(new Edge(4, 0));
        graph[2].add(new Edge(2,3));
        graph[4].add(new Edge(4,1));
        graph[3].add(new Edge(3,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    static void topologicalSort(ArrayList<Edge> graph[],  int curr, boolean[] vis){
          vis[curr] = true;

          for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            topologicalSort(graph, e.dest, vis);
          }
          stack.push(curr);
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[6];
        boolean[] vis = new boolean[6];
        // boolean[] res = new boolean[4];
        createGraph(graph,6);
        for(int i=0; i<6;i++){
            if(!vis[i])
            topologicalSort(graph, i, vis);
        }
       while(!stack.isEmpty())
       System.out.print(stack.pop()+" ");
    }
}
