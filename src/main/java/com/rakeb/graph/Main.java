package com.rakeb.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Mazharul on 10/2/16.
 */
public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input;
        try {
            input = new FileInputStream("/Users/Mazharul/IdeaProjects/shortestpath/src/main/resources/config.properties"); ///Users/Mazharul/IdeaProjects/shortestpath/src/main/resources
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sourceNodeId = Integer.parseInt(prop.getProperty("sourceNodeId"));
        int destNodeId = Integer.parseInt(prop.getProperty("destNodeId"));


        String file = "/Users/Mazharul/IdeaProjects/shortestpath/src/main/resources/network.txt";

        Graph graph = new Graph();
        graph.generateAjdListGraph(file);
        graph.printGraph();

//        Bfs bfs = new Bfs();
//        Node source = graph.getNode(sourceNodeId);
//        Node dest = graph.getNode(destNodeId);
//
//        path = bfs.findShortestPath(adjGraph, source, dest);
//        bfs.printPath(path);
    }
}
