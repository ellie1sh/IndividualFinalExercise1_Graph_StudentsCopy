package graphdemo1;

import java.util.*;

/**
 * Class representing a Node in the graph.
 */
public class Node {
    private int id;
    private List<Edge> neighbours = new ArrayList<Edge>();

    /**
     * Gets the ID of the node.
     * @return the id
     */
    public int getNodeId() {
        return this.id;
    }

    /**
     * Adds a neighbour edge to the node.
     * @param e The edge to add
     */
    public void addNeighbour(Edge e) {
        if(this.neighbours.contains(e)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            System.out.println("Successfully added " + e);
            this.neighbours.add(e);
        }
    }

    /**
     * Prints the list of neighbours and details.
     */
    public void getNeighbours() {
        System.out.println("List of all edges that node " + this.id + " has:");
        System.out.println();
        for (int i = 0; i < this.neighbours.size(); i++ ){
            System.out.println("ID of Edge: " + neighbours.get(i).getId() + "\nID of the first node: " +
            neighbours.get(i).getIdOfStartNode() +
            "\nID of the second node: " + neighbours.get(i).getIdOfEndNode());
            System.out.println();
        }
        System.out.println(neighbours);
    }

    /**
     * Constructor for Node.
     * @param id The ID of the node
     */
    public Node(int id) {
        this.id = id;
    }

    /**
     * String representation of the Node.
     * @return the id as a string
     */
    public String toString(){
        return ""+id;
    }
}
