package graph;
/**
 * 
 * @author Hebmann, Rogeon
 * @version 1.0
 * This interface represents a graph
 *
 */
public interface Graph {

	/**
	 * method to add an Edge
	 * @param e Edge to add
	 */
	public int addEdge(Edge e);

	/**
	 * method to add a Vertex
	 * @param v Vertex to add
	 */
	public int addVertex(Vertex v);
	
	
	/**
	 * method to get graph order
	 * @return number of Vertexes in this graph
	 */
	public int ordre();
	
	/**
	 * method to check if a graph is simple or not
	 * @return true if graph is simple, else returns false
	 */
	public boolean estSimple();
	
	/**
	 * method to check if a graph is full or not
	 * @return true if graph is full, else returns false
	 */
	public boolean estComplet();
	
	/**
	 * method that returns the matrix of the graph
	 * @return the matrix of the graph
	 */
	public int[][] matrice();
	
	/**
	 * method to check if 2 Vertex are linked (chained)
	 * @param a the first Vertex
	 * @param b the second Vertex
	 * @return true if the 2 Vertex are linked
	 */
	public boolean sontLies(Vertex a, Vertex b);
	
	/**
	 * method to check if a graph is related
	 * @return true if the graph is related
	 */
	public boolean connexe();
	
	/**
	 * method to get distance between 2 Vertex
	 * @param a the first Vertex
	 * @param b the second Vertex
	 * @return the distance between the 2 Vertex
	 */
	public int distance(Vertex a, Vertex b);
	
	/**
	 * method to get diameter of the graph
	 * @return diameter of the graph
	 */
	public int diametre();
	
	/**
	 * method to check if a graph is eulerian
	 * @return true if the graph is eulerian
	 */
	public boolean estEulerien();
	
	/**
	 * method to check if the graph is a subgraph of the parameter
	 * @param a the graph which our graph could be a subgraph of
	 * @return true if the graph is a subgraph of the parameter
	 */
	public boolean estSousGraphe(Graph a);
	
	/**
	 * method to check if a graph is stable
	 * @return true if the graph is stable
	 */
	public boolean estStable();
}
