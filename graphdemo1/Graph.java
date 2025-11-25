package graphdemo1;

import java.util.*;

/**
 * Class representing the Graph.
 */
public class Graph {
    private List<Node> nodes = new ArrayList<Node>();
    private int numberOfNodes = 0;

    /**
     * Checks if there are enough nodes to form connections.
     * @return true if more than 1 node, false otherwise
     */
    public boolean checkForAvailability() { // will be used in TestGraph java
        return this.numberOfNodes > 1;
    }

    /**
     * Creates a new node in the graph.
     * @param node The node to add
     */
    public void createNode(Node node) {
        this.nodes.add(node);
        this.numberOfNodes++; //a node has been added
    }

    /**
     * Gets the number of nodes in the graph.
     * @return number of nodes
     */
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }
}
