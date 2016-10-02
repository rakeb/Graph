package com.rakeb.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mazharul on 10/1/16.
 */
public class Node {
    private int nodeId;
    private List<Edge> edgeList;

    public Node(int nodeId) {
        this.nodeId = nodeId;
        edgeList = new ArrayList<Edge>();
    }

    public void addEdge(Edge edge) {
        if(this.edgeList.contains(edge)) {
            return;
        }
        this.edgeList.add(edge);
    }

    public boolean removeEdge(Edge edge) {
        return this.edgeList.remove(edge);
    }

    public boolean containsEdge(Edge edge) {
        return this.edgeList.contains(edge);
    }



    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }
}
