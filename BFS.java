

import java.util.*;;

public class BFS {

    
    static class Edge{
        int src;
        // int wt;
        int dest;
        public Edge(int s, int d){
              this.src = s;
              this.dest = d;
            //   this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
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
        //  int  s, d;
        
        //  System.out.println("Create a node?\nEnter Source: ");
        //  s = sc.nextInt();
        //  while(s != -1){
        //         System.out.println("Enter Destination: ");
        //         d = sc.nextInt();

        //         graph[s].add(new Edge(s,d));
        //         System.out.println("Enter Source:");
        //         s = sc.nextInt();
        //  }
    }

    public static void bfs(ArrayList<Edge> graph[], boolean[] vis, int start){
       Queue<Integer> queue = new LinkedList<>();
       
       queue.add(start);

       while(!queue.isEmpty()){
        int curr = queue.remove();
        if(vis[curr] == false){
           System.out.print(curr+" ");
           vis[curr]=true;

           for(int i = 0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            queue.add(e.dest);
           }
        }
        
       }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis){
         System.out.print(curr+" ");
         vis[curr] = true;
         for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false)
            dfs(graph, e.dest, vis);
         }
    }

    public static void main(String args[]){
        int V = 7;
        /*
         *   1--3
         *  /   | \ 
         * 0    |   5-6
         *  \   |  /
         *   2--4
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        createGraph(graph);
        for(int i=0 ;i< V; i++){
          if(vis[i] == false){
            bfs(graph, vis, i);
            // dfs(graph, i, vis);
          }
        }
        
       
    }
}
