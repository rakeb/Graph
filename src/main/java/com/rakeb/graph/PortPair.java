package com.rakeb.graph;

/**
 * Created by Mazharul on 10/1/16.
 */
public class PortPair {
    private int srcPort;
    private int destPort;

    public PortPair(int srcPort, int destPort) {
        this.srcPort = srcPort;
        this.destPort = destPort;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public int getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }
}
