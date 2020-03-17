
public class Dijkstra {
	
	public static void main(String[] args) 
	{
		Graph graph = new Graph(6);
		graph.addEdge(0,1,1);
		graph.addEdge(0,3,4);
		graph.addEdge(0,2,2);
		graph.addEdge(2,3,3);
		graph.addEdge(2,5,3);
		graph.addEdge(3,4,1);
		graph.addEdge(1,4,3);
		graph.addEdge(1,3,1);
		graph.addEdge(3,5,2);
		graph.dijkstra(2);
		
	}
}
