import java.util.ArrayList;
public class Graph{
    private int [][] graph;
    
    public Graph(int [][] graph){
        this.graph = graph;
    }
    public void add_edge(int from, int to){
        graph[from][to] = 1;
        graph[to][from]=1; // need to make graph undirected
    }
    public void remove_egde(int from, int to){
        graph[from][to] = 0;
        graph[to][from]= 0;
    }
    public int [] traverse_bfs(int start){
        Queue Q = new Queue(5);
        boolean [] visited = new boolean [graph.length];
        int [] traversed = new int [graph.length];
        Q.push(start);
        visited[start] = true;
        System.out.println(Q.peek());
        while(Q.getsize() > 0){
            int n = Q.peek();
            Q.pop();
            for(int i = 0; i <graph[n].length -1; i++){
                if (graph[n][i] == 1 && visited[i] == false){
                    Q.push(i+1);
                    visited[i] = true;
                    traversed[i] = n;
                }

            }
        }
        return traversed;
    }
    public void print(){
        for(int i=0; i < graph.length; i++){
            for(int j=0; j< graph[i].length; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String [] args){
        
        int [][] adjMatrix = {
            {0,1,1,0,0},
            {1,0,1,1,0},
            {1,1,0,0,1},
            {0,1,0,0,1},
            {0,0,1,1,0},
        };
        Graph G = new Graph(adjMatrix);
        G.print();

        G.add_edge(0,4);
        G.print();

        G.remove_egde(0, 4);

        G.print();

        G.traverse_bfs(1);



    }
}