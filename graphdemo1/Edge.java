package graphdemo1;

/**
 * Class representing an Edge in the graph.
 */
public class Edge {
    private Node start;
    private Node end;
    private double weight;
    private int id;

    /**
     * Gets the ID of the edge.
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the starting node of the edge.
     * @return the start node
     */
    public Node getStart() {
        return this.start;
    }

    /**
     * Gets the ID of the start node.
     * @return the id of the start node
     */
    public int getIdOfStartNode() {
        return this.start.getNodeId();
    }

    /**
     * Gets the ending node of the edge.
     * @return the end node
     */
    public Node getEnd() {
        return this.end;
    }

    /**
     * Gets the ID of the end node.
     * @return the id of the end node
     */
    public int getIdOfEndNode() {
        return this.end.getNodeId();
    }

    /**
     * Gets the weight of the edge.
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Constructor for Edge.
     * @param s Start node
     * @param e End node
     * @param w Weight of the edge
     * @param id ID of the edge
     */
    public Edge(Node s, Node e, double w, int id) {
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }

    /**
     * String representation of the Edge.
     * @return string with start and end node info
     */
    public String toString(){
        return "(" + start + "," + end + ")";
    }
}
