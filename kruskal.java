public class Kruskal{
	static int[] pset, rank;
	static List<Edge> edgeList;
	static int N;
	static String[] codes;
	
	static int find(int i) {
		return pset[i] == i ? i : (pset[i] = find(pset[i]));
	}
	
	static boolean isSameSet(int i, int j) {
		return find(i) == find(j);
	}
	
	static void merge(int i, int j) {
		int pi = find(i);
		int pj = find(j);
		if (rank[pi] > rank[pj])
			pset[pj] = pi;
		else
			pset[pi] = pj;
		if (rank[pi] == rank[pj])
			++rank[pj];
	}
	
	static class Edge implements Comparable<Edge> {
		int u, v, w;
		public Edge(int u, int v, int w) {
			this.u = u; this.v = v; this.w = w;
		}

		public int compareTo(Edge e) {
			return this.w - e.w;
		}
	}
	
	static int kruskal() {
		pset = new int[N];
		rank = new int[N];

		for (int i = 0; i < N; ++i) {
			pset[i] = i;
			rank[i] = 0;
		}
		int cost = 0;
		
		Collections.sort(edgeList);
		for (Edge e : edgeList) {
			int u = e.u, v = e.v, w = e.w;
			if (!isSameSet(u, v)) {
				merge(u, v);
				cost += w;
			}
		}
		return cost;
	}
	public static void main(String[] args) throws IOException {
    	/*
        * Inicializa el grafo
        */
    	edgeList = new ArrayList<Edge>();
        //Forma de agregar los elementos
        edgeList.add(new Edge(u, v, costos);
		    }
	}
}
