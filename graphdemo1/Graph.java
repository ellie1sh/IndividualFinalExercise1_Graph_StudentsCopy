package graphdemo1;

import java.util.*;

/**
 * Graph class represents a graph data structure.
 * A graph contains a list of nodes and keeps track of how many nodes it has.
 * 
 * @author Student
 * @version 1.0
 */
public class Graph {
    
    // List to store all nodes in the graph
    private List<Node> nodes = new ArrayList<Node>();
    
    // Counter to keep track of the number of nodes
    private int numberOfNodes = 0;

    /**
     * Checks if the graph has at least 2 nodes.
     * This is used to check if edges can be created between nodes.
     * Will be used in TestGraph.java
     * 
     * @return true if there are more than 1 node, false otherwise
     */
    public boolean checkForAvailability() {
        return this.numberOfNodes > 1;
    }

    /**
     * Adds a node to the graph.
     * Also increments the node counter.
     * 
     * @param node the node to add to the graph
     */
    public void createNode(Node node) {
        this.nodes.add(node);
        this.numberOfNodes++; // a node has been added
    }

    /**
     * Gets the total number of nodes in the graph.
     * 
     * @return the number of nodes
     */
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }
}
