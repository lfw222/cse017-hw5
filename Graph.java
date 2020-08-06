import java.util.ArrayList;
import java.util.Arrays;
public class Graph{
    private int [][] graph;
    private int [] traversed;
    
    public Graph(int [][] graph){
        this.graph = graph;
    }
    public void add_edge(int from, int to){
        graph[from][to] = 1;
    }
    public void remove_egde(int from, int to){
        graph[from][to] = 0;
    }
    public ArrayList<Integer> traverse_bfs(int start){
        //graph row and column start at 0.
        int n = start;
        Queue Q = new Queue(5);
        boolean [] visited = new boolean [graph.length];
        ArrayList<Integer> traversed = new ArrayList<Integer>();
        Q.push(start);
        visited[start] = true;
        traversed.add(start);
        int count = 0;
        while(Q.getsize() != 0){
            n = Q.peek();
            System.out.println(traversed);
            Q.pop();     
            for(int i = 0; i < graph.length; i++){ 
                if (n != 5){
                if (graph[n][i] == 1 && visited[i] == false){
                    Q.push(i+1);
                    visited[i] = true;
                    traversed.add(i);    
                }
            }  
            
        }
        }
        return traversed;
    }
    public ArrayList<Integer> traverse_dfs(int start){ // not working properly looked at psuedo code still cant seem to get it to iterate properly
        ArrayList<Integer> traversed = new ArrayList<Integer>();
        Stack S = new Stack(5);
        int n = start;
        boolean [] visited = new boolean [graph.length];
       // if (!visited[n]){
        visited[n] = true;
        traversed.add(n);
       // }
        S.push(n);
        
        for(int i = n; i < graph.length; i++){ 
            
            if(!visited[i]){
            return traverse_dfs(i);
            }  
            System.out.println(traversed);
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
        System.out.println();
        G.traverse_dfs(0);



    }
}