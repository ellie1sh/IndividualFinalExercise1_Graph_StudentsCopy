package graphdemo1;

/**
 * Edge class represents an edge in a graph.
 * An edge connects two nodes and has a weight and an id.
 * 
 * @author Student
 * @version 1.0
 */
public class Edge {
    
    // The starting node of the edge
    private Node start;
    
    // The ending node of the edge
    private Node end;
    
    // The weight of the edge
    private double weight;
    
    // The unique id of the edge
    private int id;

    /**
     * Gets the id of this edge.
     * 
     * @return the id of the edge
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the starting node of this edge.
     * 
     * @return the start node
     */
    public Node getStart() {
        return this.start;
    }

    /**
     * Gets the id of the starting node.
     * 
     * @return the id of the start node
     */
    public int getIdOfStartNode() {
        return this.start.getNodeId();
    }

    /**
     * Gets the ending node of this edge.
     * 
     * @return the end node
     */
    public Node getEnd() {
        return this.end;
    }

    /**
     * Gets the id of the ending node.
     * 
     * @return the id of the end node
     */
    public int getIdOfEndNode() {
        return this.end.getNodeId();
    }

    /**
     * Gets the weight of this edge.
     * 
     * @return the weight of the edge
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Constructor to create a new Edge.
     * 
     * @param s the starting node
     * @param e the ending node
     * @param w the weight of the edge
     * @param id the unique id of the edge
     */
    public Edge(Node s, Node e, double w, int id) {
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }

    /**
     * Returns a string representation of the edge.
     * 
     * @return a string showing the start and end nodes
     */
    public String toString() {
        return ("(" + start + "," + end + ")");
    }
}
