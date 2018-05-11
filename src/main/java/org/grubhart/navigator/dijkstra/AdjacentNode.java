package org.grubhart.navigator.dijkstra;

public class AdjacentNode extends Node{



    private Integer distance;

    public AdjacentNode(String name, int distance) {
        super(name);
        this.distance=distance;


    }
}
