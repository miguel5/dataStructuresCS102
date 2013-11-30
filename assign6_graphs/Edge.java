/**
 * The Edge component of a graph, consisting of a label with generic type L,
 * and {@link head} / {@link tail} Nodes which have labels of generic type T.
 * <p>
 * ***********************************************************************<br>
 * Computer Science 102: Data Structures<br>
 * New York University, Fall 2013,<br>
 * Lecturers: Eric Koskinen and Daniel Schwartz-Narbonne<br>
 * ***********************************************************************
 *
 * @author      Eric Koskinen       <ejk@cs.nyu.edu>
 * @version     $Revision$
 * @since       2013-11-25
 */

public class Edge<T, L> {
    private L label;
    private Node<T,L> head;
    private Node<T,L> tail;

    public Edge(L l, Node<T,L> h, Node<T,L> t) {
	label = l; head = h; tail = t;
    }

    /** 
     * Getters and Setters
     */
    public L getLabel() { return label; }
    public void setLabel(L l) { label = l; }
    public Node<T,L> getTail() { return tail;}

    /** 
     * Returns a string of the form:
     * Edge(foo)
     * where "foo" is generated by the label's toString() method
     */
    public String toString() {
	return "Edge("+label.toString()+")";
    }
}