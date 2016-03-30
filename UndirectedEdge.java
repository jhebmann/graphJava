package graph;
/**
 * 
 * @author Hebmann, Rogeon
 * @version 1.0
 * This class represents an undirected edge in a graph
 *
 */
public class UndirectedEdge extends Edge{

	/**
	 * constructor of UndirectedEdge
	 * @param a the first vertex of an edge
	 * @param b the second vertex of an edge
	 */
	public UndirectedEdge(Vertex a, Vertex b){
		super(a, b);
	}
}
