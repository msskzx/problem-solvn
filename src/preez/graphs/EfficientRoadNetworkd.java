package preez.graphs;

public class EfficientRoadNetworkd {
	
	static int V=0;
	static int graph[][];

	// from the set of vertices not yet included in shortest path tree
	static int minDistance(int dist[], Boolean sptSet[]) {
	    // Initialize min value
	    int min = Integer.MAX_VALUE, min_index=-1;

	    for (int v = 0; v < V; v++)
	        if (sptSet[v] == false && dist[v] <= min)
	        {
	            min = dist[v];
	            min_index = v;
	        }

	    return min_index;
	}

	// Funtion that implements Dijkstra's single source shortest path
	// algorithm for a graph represented using adjacency matrix
	// representation
	static boolean dijkstra(int src)
	{
	    int dist[] = new int[V]; // The output array. dist[i] will hold
	                             // the shortest distance from src to i

	    // sptSet[i] will true if vertex i is included in shortest
	    // path tree or shortest distance from src to i is finalized
	    Boolean sptSet[] = new Boolean[V];

	    // Initialize all distances as INFINITE and stpSet[] as false
	    for (int i = 0; i < V; i++)
	    {
	        dist[i] = Integer.MAX_VALUE;
	        sptSet[i] = false;
	    }

	    // Distance of source vertex from itself is always 0
	    dist[src] = 0;

	    // Find shortest path for all vertices
	    for (int count = 0; count < V-1; count++)
	    {
	        // Pick the minimum distance vertex from the set of vertices
	        // not yet processed. u is always equal to src in first
	        // iteration.
	        int u = minDistance(dist, sptSet);

	        // Mark the picked vertex as processed
	        sptSet[u] = true;

	        // Update dist value of the adjacent vertices of the
	        // picked vertex.
	        for (int v = 0; v < V; v++)

	            // Update dist[v] only if is not in sptSet, there is an
	            // edge from u to v, and total weight of path from src to
	            // v through u is smaller than current value of dist[v]
	            if (!sptSet[v] && graph[u][v]!=0 &&
	                    dist[u] != Integer.MAX_VALUE &&
	                    dist[u]+graph[u][v] < dist[v])
	                dist[v] = dist[u] + graph[u][v];
	    }
	    
	    for(int i =0;i<dist.length;i++)
	        if(dist[i]>2)
	            return false;
	    return true;
	}

	boolean efficientRoadNetwork(int n, int[][] roads) {
	    V = n;
	    graph = new int[V][V];
	    
	    for(int i = 0;i<roads.length;i++) {
	        graph[roads[i][0]][roads[i][1]] = 1;
	        graph[roads[i][1]][roads[i][0]] = 1;
	    }
	    
	    for(int i = 0;i<n;i++)
	        if(!dijkstra(i))
	            return false;
	    return true;
	}

}

class NotMine {
	boolean efficientRoadNetwork(int n, int[][] roads) {
		if (n == 1)
			return true;
		boolean connected[][] = new boolean[n][n];
		for (int[] road : roads) {
			int city1 = road[0];
			int city2 = road[1];
			connected[city1][city2] = connected[city2][city1] = true;
		}
		for (int city1 = 0; city1 < n; city1++)
			for (int city2 = 0; city2 < n; city2++) {
				if (connected[city1][city2])
					continue;
				boolean found = false;
				for (int t = 0; t < n && !found; t++) {
					found |= connected[city1][t] && connected[city2][t];
				}
				if (!found)
					return false;
			}
		return true;
	}

}
