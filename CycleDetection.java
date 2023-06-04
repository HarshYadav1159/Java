import java.util.*;

public class CycleDetection {
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
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2,3));
        graph[1].add(new Edge(1,0));
        graph[3].add(new Edge(3,0));
    }

    static boolean isCycleDetection(ArrayList<Edge> graph[], boolean[] vis, int curr, boolean[] res){
        vis[curr] = true;
        res[curr] = true;

        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(res[e.dest]){
             return true;
            }
            else if(!vis[e.dest])
            if(isCycleDetection(graph, vis, e.dest, res)){
            return true;
           } 
        }

        res[curr]=false;
        return false;

    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[4];
        boolean[] vis = new boolean[4];
        boolean[] res = new boolean[4];
        createGraph(graph,4);
        boolean ans=false;

        for(int i=0; i<4; i++){
            if(!vis[i]){
                ans = isCycleDetection(graph, vis, 0, res);
                if(ans){
                    System.out.print(ans);
                    break;
                }
            }
            
        }
        
    }
    
}
