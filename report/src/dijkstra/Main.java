package dijkstra;

public class Main {
    static int V=9;
    static int[]d;

    static int minD(Boolean s[]){
        int m=Integer.MAX_VALUE,mIdx=-1;
        for(int v=0;v<V;v++)
            if(!s[v]&&d[v]<=m){
                m=d[v];
                mIdx=v;
            }
        return mIdx;
    }

    static void printS(){
        System.out.println("Vertex  Distance from Source");
        for(int i=0;i<V;i++)
            System.out.println(i+"  "+d[i]);
    }

    static void dijkstra(int g[][],int src){
        d=new int[V];
        Boolean s[]=new Boolean[V];
        for(int i=0;i<V;i++){
            d[i]=Integer.MAX_VALUE;
            s[i]=false;
        }
        d[src]=0;
        for(int c=0;c<V-1;c++){
            int u=minD(s);
            s[u]=true;
            for(int v=0;v<V;v++)
                if(!s[v]&&g[u][v]!=0&&d[u]!=Integer.MAX_VALUE&&d[u]+g[u][v]<d[v])
                    d[v]=d[u]+g[u][v];
        }
        printS();
        return ;
    }



    public static void main(String[] args) {
        int graph[][]= new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        dijkstra(graph,0);
    }
}
