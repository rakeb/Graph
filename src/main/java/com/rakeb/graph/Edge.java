package com.rakeb.graph;

/**
 * Created by Mazharul on 10/1/16.
 */
public class Edge {
    private Node srcNode;
    private Node destNode;
    private PortPair portPair;
    private int weight;

    public Edge(Node srcNode, Node destNode, PortPair portPair, int weight) {
        this.srcNode = srcNode;
        this.destNode = destNode;
        this.portPair = portPair;
        this.weight = weight;
    }

    public Edge(Node srcNode, Node destNode, PortPair portPair) {
        this.srcNode = srcNode;
        this.destNode = destNode;
        this.portPair = portPair;
        this.weight = 1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(Node srcNode) {
        this.srcNode = srcNode;
    }

    public Node getDestNode() {
        return destNode;
    }

    public void setDestNode(Node destNode) {
        this.destNode = destNode;
    }

    public PortPair getPortPair() {
        return portPair;
    }

    public void setPortPair(PortPair portPair) {
        this.portPair = portPair;
    }
}
