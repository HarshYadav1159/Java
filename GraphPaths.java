import java.util.*;

public class GraphPaths {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
           this.src = s;
           this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        Scanner sc = new Scanner(System.in);
         for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
         }

         graph[0].add(new Edge(0, 1));
         graph[0].add(new Edge(0, 2));

         graph[1].add(new Edge(1, 0));
         graph[1].add(new Edge(1, 3));

         graph[2].add(new Edge(2, 0));
         graph[2].add(new Edge(2, 4));

         graph[3].add(new Edge(3, 1));
         graph[3].add(new Edge(3, 4));
         graph[3].add(new Edge(3, 5));

         graph[4].add(new Edge(4, 2));
         graph[4].add(new Edge(4, 3));
         graph[4].add(new Edge(4, 5));

         graph[5].add(new Edge(5, 3));
         graph[5].add(new Edge(5, 4));
         graph[5].add(new Edge(5, 6));
    }

    public static void paths(ArrayList<Edge> graph[], int curr, boolean[] vis, int tar, String path){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[curr] == false){
                vis[curr] =true;
                paths(graph, e.dest, vis, tar, path + e.dest);
                vis[curr] = false;
            }
        }
    }

    public static void main(String args[]){
        int V =7;
        boolean[] vis = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        paths(graph, 0, vis, 5, "0");
    }
    
}
