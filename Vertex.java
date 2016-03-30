package graph;
/**
 * 
 * @author Hebmann, Rogeon
 * @version 1.0
 * This class represents a vertex in a graph
 *
 */
public class Vertex {
	private Object objet;

	/**
	 * constructor of Vertex
	 * @param o the Object that represents the Vertex
	 */
	public Vertex(Object o){
		setObjet(o);
	}

	/**
	 * getter of objet
	 * @return value of objet
	 */
	public Object getObjet() {
		return objet;
	}

	/**
	 * setter of objet
	 * @param objet the value objet will get
	 */
	public void setObjet(Object objet) {
		this.objet = objet;
	}
}
