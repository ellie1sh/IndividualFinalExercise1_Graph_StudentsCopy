package graphdemo1;

/*
 * OUTPUT OF THE MAIN CLASS:
 * 
 * Successfully added [start=+end=]
 * Successfully added [start=+end=]
 * List of all edges that node 1 has:
 * ================================================
 * ID of Edge: 1 
 * ID of the first node: 1
 * ID of the second node: 2
 * ID of Edge: 2 
 * ID of the first node: 1
 * ID of the second node: 3
 * 
 * [[start=+end=], [start=+end=]]
 */

/**
 * TestGraph class tests the Graph, Node, and Edge classes.
 * This is the main class that demonstrates the functionality.
 */
public class TestGraph {
    /**
     * Main method to test the graph implementation
     * @param args command line arguments
     */
    public static void main(String args[]) {
        // Create a new graph
        Graph graph = new Graph();
        
        // Create three new nodes with IDs 1, 2, and 3
        Node node1 = new Node(1); // create a new node that contains id of 1
        Node node2 = new Node(2); // create a new node that contains id of 2
        Node node3 = new Node(3); // create a new node that contains id of 3
        
        // Add nodes to the graph
        graph.createNode(node1); // numberOfNodes should increment by 1
        graph.createNode(node2); // numberOfNodes should increment by 1
        graph.createNode(node3); // numberOfNodes should increment by 1
        
        // Create edges between nodes
        Edge e12 = new Edge(node1, node2, 5, 1); // create an edge that connects node1 to node2 and contains weight of 5
        Edge e13 = new Edge(node1, node3, 10, 2); // create an edge that connects node1 to node3 and contains weight of 10
        
        // Check if graph is available (has more than 1 node)
        if (graph.checkForAvailability()) {
            // Two nodes can be connected via edge
            // Connect nodes 1 and 2 (node1)
            node1.addNeighbour(e12); // connect 1 and 2 (node1)
            node1.addNeighbour(e13);
            node1.getNeighbours();
        } else {
            System.out.println("There are less than 2 nodes. Add more to connect.");
        }
    }
}
