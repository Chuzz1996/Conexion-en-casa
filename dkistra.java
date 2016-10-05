public class dkistra{
    public static int minDistance(int[] dist, boolean[] SptSet){
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for (int v = 0; v < V; v++) {
			if(!SptSet[v] && dist[v]<=min){
				min = dist[v];
				min_index = v;
			}
		}return min_index;
	}
    public static void dijkstra(int graph[][], int inicio){
	int[] dist = new int[V];
	boolean[] sptSet = new boolean[V];
	Arrays.fill(dist, Integer.MAX_VALUE);
	Arrays.fill(sptSet, false);
	dist[inicio] = 0;
	for (int count = 0; count < V-1; count++) {
		int u = minDistance(dist,sptSet);
		sptSet[u] = true;
		for (int v = 0; v < V; v++) {
			if(!sptSet[v] && graph[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v]){
				dist[v] = dist[u] + graph[u][v];
			}
		}
	}
}
