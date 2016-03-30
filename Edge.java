package graph;
/**
 * 
 * @author Hebmann, Rogeon
 * @version 1.0
 * This abstract class represents an edge in a graph
 *
 */
public abstract class Edge {
	private Vertex point1;
	private Vertex point2;
	
	/**
	 * constructor of Edge
	 * @param a the first vertex of an edge
	 * @param b the second vertex of an edge
	 */
	public Edge(Vertex a, Vertex b){
		setPoint1(a);
		setPoint2(b);
	}
	
	/**
	 * getter of point1
	 * @return value of point1
	 */
	public Vertex getPoint1() {
		return point1;
	}

	
	/**
	 * setter of point1
	 * @param point1 the value point1 will get
	 */
	public void setPoint1(Vertex point1) {
		this.point1 = point1;
	}

	
	/**
	 * getter of point2
	 * @return value of point2
	 */
	public Vertex getPoint2() {
		return point2;
	}
	
	/**
	 * setter of point2
	 * @param point2 the value point2 will get
	 */
	public void setPoint2(Vertex point2) {
		this.point2 = point2;
	}
}
