package graphdemo1;

import java.util.*;

/**
 * Graph class represents a graph data structure.
 * It contains a list of nodes and tracks the number of nodes.
 */
public class Graph {
    // Private list to store all nodes in the graph
    private List<Node> nodes = new ArrayList<Node>();
    // Private variable to track the number of nodes
    private int numberOfNodes = 0;
    
    /**
     * Checks if the graph is available for operations
     * Will be used in TestGraph.java
     * @return true if there are more than 1 node, false otherwise
     */
    public boolean checkForAvailability() {
        return this.numberOfNodes > 1;
    }
    
    /**
     * Creates and adds a node to the graph
     * @param node the node to add to the graph
     */
    public void createNode(Node node) {
        this.nodes.add(node);
        this.numberOfNodes++; // a node has been added
    }
    
    /**
     * Gets the total number of nodes in the graph
     * @return the number of nodes
     */
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }
}
