package graphdemo1;

/**
 * Edge class represents a connection between two nodes in a graph.
 * Each edge has a start node, end node, weight, and unique ID.
 */
public class Edge {
    // Private variables to store edge information
    private Node start;
    private Node end;
    private double weight;
    private int id;
    
    /**
     * Gets the ID of this edge
     * @return the edge ID
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Gets the start node of this edge
     * @return the start node
     */
    public Node getStart() {
        return this.start;
    }
    
    /**
     * Gets the ID of the start node
     * @return the ID of the start node
     */
    public int getIdOfStartNode() {
        return this.start.getNodeId();
    }
    
    /**
     * Gets the end node of this edge
     * @return the end node
     */
    public Node getEnd() {
        return this.end;
    }
    
    /**
     * Gets the ID of the end node
     * @return the ID of the end node
     */
    public int getIdOfEndNode() {
        return this.end.getNodeId();
    }
    
    /**
     * Gets the weight of this edge
     * @return the weight value
     */
    public double getWeight() {
        return this.weight;
    }
    
    /**
     * Constructor to create a new Edge
     * @param s the start node
     * @param e the end node
     * @param w the weight of the edge
     * @param id the unique ID for this edge
     */
    public Edge(Node s, Node e, double w, int id) {
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }
    
    /**
     * Returns a string representation of the edge
     * @return string showing start and end node IDs
     */
    public String toString() {
        return "[" + "start=" + "+end=" + "]";
    }
}
