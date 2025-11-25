package graphdemo1;

import java.util.*;

/**
 * Node class represents a node (vertex) in a graph.
 * A node has an id and a list of edges (neighbours) connected to it.
 * 
 * @author Student
 * @version 1.0
 */
public class Node {
    
    // The unique id of the node
    private int id;
    
    // List to store all edges connected to this node
    private List<Edge> neighbours = new ArrayList<Edge>();

    /**
     * Gets the id of this node.
     * 
     * @return the id of the node
     */
    public int getNodeId() {
        return this.id;
    }

    /**
     * Adds an edge as a neighbour to this node.
     * If the edge already exists, it will not be added again.
     * 
     * @param e the edge to add
     */
    public void addNeighbour(Edge e) {
        // Check if the edge already exists in the neighbours list
        if (this.neighbours.contains(e)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            // Add the edge if it doesn't exist
            System.out.println("Successfully added " + e);
            this.neighbours.add(e);
        }
    }

    /**
     * Prints all the edges (neighbours) connected to this node.
     * Shows the edge id, start node id, and end node id for each edge.
     */
    public void getNeighbours() {
        System.out.println("List of all edges that node " + this.id + " has: ");
        System.out.println("===================================");
        
        // Loop through all neighbours and print their details
        for (int i = 0; i < this.neighbours.size(); i++) {
            System.out.println("ID of Edge: " + neighbours.get(i).getId() + "\nID of the first node: " +
                neighbours.get(i).getIdOfStartNode() +
                "\nID of the second node: " + neighbours.get(i).getIdOfEndNode());
            System.out.println();
        }
        
        // Print the list of neighbours
        System.out.println(neighbours);
    }

    /**
     * Constructor to create a new Node.
     * 
     * @param id the unique id of the node
     */
    public Node(int id) {
        this.id = id;
    }

    /**
     * Returns a string representation of the node.
     * 
     * @return the id of the node as a string
     */
    public String toString() {
        return "" + id;
    }
}
