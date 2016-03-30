package graph;
/**
 * 
 * @author Hebmann, Rogeon
 * @version 1.0
 * This class represents a directed edge in a graph
 *
 */
public class DirectedEdge extends Edge{
	private Vertex pointDepart;

	/**
	 * constructor of DirectedEdge
	 * @param a the first vertex of an edge, also the beginning point of the directed Edge
	 * @param b the second vertex of an edge
	 */
	public DirectedEdge(Vertex a, Vertex b){
		super(a, b);
		setPointDepart(a);
	}

	/**
	 * getter of pointDepart
	 * @return value of pointDepart
	 */
	public Vertex getPointDepart() {
		return pointDepart;
	}

	/**
	 * setter of pointDepart
	 * @param pointDepart the value pointDepart will get
	 */
	public void setPointDepart(Vertex pointDepart) {
		this.pointDepart = pointDepart;
	}
}
