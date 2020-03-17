import java.util.Scanner;

class Main {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int nodes = scan.nextInt();
		int edges = scan.nextInt();
		int source = scan.nextInt();
		Graph graph = new Graph(nodes);
		int iter = 0; 
		while (iter<edges)
		{
			int u = scan.nextInt();
			int v = scan.nextInt();
			int w = scan.nextInt();
			graph.addEdge(u, v, w);
			iter++; 
		}
		graph.dijkstra(source);
	}
}
