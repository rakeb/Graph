package com.rakeb.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mazharul on 10/1/16.
 */
public class Graph {
    List<Node> listOfNode;
    List<Edge> listOfEdge;

    public void generateAjdListGraph(String filePath) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        listOfNode = new ArrayList<Node>();
        listOfEdge = new ArrayList<Edge>();

        int sourceNodeId;
        int sourcePort;
        int destNodeId;
        int destPort;

        Node sourceNode = null, destNode = null;
        PortPair portPair = null, reversePortPair;
        Edge edge, reverseEdge;

        while (sc.hasNext()) {
            sourceNodeId = sc.nextInt();
            sourcePort = sc.nextInt();
            destNodeId = sc.nextInt();
            destPort = sc.nextInt();

            if (ifNodeNotExist(sourceNodeId)) {
                sourceNode = new Node(sourceNodeId);
                listOfNode.add(sourceNode);
            }

            if (ifNodeNotExist(destNodeId)) {
                destNode = new Node(destNodeId);
                listOfNode.add(destNode);
            }

            sourceNode = getNode(sourceNodeId);
            destNode = getNode(destNodeId);

            portPair = new PortPair(sourcePort, destPort);
            reversePortPair = new PortPair(destPort, sourcePort);

            edge = new Edge(sourceNode, destNode, portPair);
            reverseEdge = new Edge(destNode, sourceNode, reversePortPair);


            if (!isEdgeExist(edge)) {
                listOfEdge.add(edge);
            }

            if (!sourceNode.containsEdge(edge)) {
                sourceNode.addEdge(edge);
            }

            if (!destNode.containsEdge(reverseEdge)) {
                destNode.addEdge(reverseEdge);
            }

        }
    }

    boolean ifNodeNotExist(int nodeId) {
        for (Node node : listOfNode) {
            if (node.getNodeId() == nodeId)
                return false;
        }
        return true;
    }

    boolean isNodeExist(Node node) {
        return this.listOfNode.contains(node);
    }

    boolean isEdgeExist(Edge edge) {
        return this.listOfEdge.contains(edge);
    }

    Node getNode(int nodeId) {
        for (Node node : listOfNode) {
            if (node.getNodeId() == nodeId)
                return node;
        }
        return null;
    }

    void printGraph() {
        System.out.println("printing Graph...");
        for (Node node : listOfNode) {
            System.out.print(node.getNodeId() + " ------> ");
            for (Edge edge : node.getEdgeList()) {
                System.out.print(edge.getDestNode().getNodeId() + "(" + edge.getPortPair().getSrcPort() + "," + edge.getPortPair().getDestPort() + ") --> ");
            }
            System.out.println("null");
        }
    }
}
