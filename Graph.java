public class Graph {
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
        push(start);
        while(Q.this.size > 0){
            int n = Q.pop();
            if(n == 1){

            }
        }
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



    }
}