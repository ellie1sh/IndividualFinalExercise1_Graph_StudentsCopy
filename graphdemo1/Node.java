package graphdemo1;

import java.util.*;

/**
 * Node class represents a vertex in a graph.
 * Each node has an ID and a list of edges (neighbours).
 */
public class Node {
    // Private variable to store node ID
    private int id;
    // Private list to store all edges connected to this node
    private List<Edge> neighbours = new ArrayList<Edge>();
    
    /**
     * Gets the ID of this node
     * @return the node ID
     */
    public int getNodeId() {
        return this.id;
    }
    
    /**
     * Adds a neighbour edge to this node
     * @param e the edge to add
     */
    public void addNeighbour(Edge e) {
        // Check if this edge has already been used for this node
        if(this.neighbours.contains(e)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            // Successfully add the edge
            System.out.println("Successfully added " + e);
            this.neighbours.add(e);
        }
    }
    
    /**
     * Prints all the neighbours (edges) of this node
     */
    public void getNeighbours() {
        System.out.println("List of all edges that node " + this.id + " has:");
        System.out.println("================================================");
        // Loop through all neighbours and print their information
        for (int i = 0; i < this.neighbours.size(); i++) {
            System.out.println("ID of Edge: " + neighbours.get(i).getId() + " \nID of the first node: " +
                    neighbours.get(i).getIdOfStartNode() + 
                    "\nID of the second node: " + neighbours.get(i).getIdOfEndNode());
        }
        System.out.println();
        System.out.println(neighbours);
    }
    
    /**
     * Constructor to create a new Node
     * @param id the unique ID for this node
     */
    public Node(int id) {
        this.id = id;
    }
    
    /**
     * Returns a string representation of the node
     * @return string showing the node ID
     */
    public String toString() {
        return "" + id;
    }
}
