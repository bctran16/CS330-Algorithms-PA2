import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {
	static class Edge
	{
		int source;
		int des; 
		int weight; 
		
		public Edge(int source, int des, int weight)
		{
			this.source	= source; 
			this.des = des; 
			this.weight = weight; 
		}
	}
	int nodes; 
	LinkedList<Edge> [] adj; 
	static class Node implements Comparable<Node>
	{
		int node;
		int dist;
		public Node(int node, int dist)
		{
			this.node = node;
			this.dist = dist; 
		}
		
		public int compareTo(Node other)
		{
			return Integer.compare(this.dist, other.dist);
		}
	}
	
	public Graph(int nodes)
	{
		this.nodes = nodes;
		adj = new LinkedList[nodes];
		for (int i = 0; i<nodes;i++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int des, int weight)
	{
		Edge edge = new Edge(source, des, weight);
		adj[source].addFirst(edge);
	}
	
	public void dijkstra(int s)
	{
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		int [] distance = new int[nodes];
		int [] parents = new int[nodes];
		boolean [] visited = new boolean[nodes];
		for (int i = 0; i<nodes; i++)
			distance[i]= Integer.MAX_VALUE; 
		distance[s] = 0; 
		
		pq.add(new Node(s, 0));
		while(pq.size()>0)
		{	int u = pq.remove().node;
			if (!visited[u])
			{
				visited[u] = true;
				for (int i = 0; i<adj[u].size();i++)
				{
					Edge v = adj[u].get(i);
					int dis = distance[u] + v.weight; 
					if (dis<distance[v.des])
					{
						distance[v.des] = dis;
						parents[v.des] = u;
						pq.add(new Node(v.des, dis));
					}
				}
			}
		}
		
		for (int i = 0; i<nodes; i++)
		{
			if (distance[i]!=Integer.MAX_VALUE&&i!=s)
				System.out.println(i +" "+  distance[i] +" "+  parents[i]);
		}
		
	}
	}
	
	
