package com.mycompany.problemsolvingandsearching;

/**
 * @author Tirth
 */

public class ProblemSolvingAndSearching {

    public static void main(String[] args) {
        Node n1= new Node(1,"Arad",false);
        Node n2= new Node(2,"Zerind",false);
        Node n3= new Node(3, "Oradea",false);
        Graph graph= new Graph(false);
        graph.insertEdge(n1,n2);
        graph.insertEdge(n1,n3);
        graph.printEdges();
    }
}
