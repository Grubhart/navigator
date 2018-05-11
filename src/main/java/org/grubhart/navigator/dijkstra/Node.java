package org.grubhart.navigator.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private List<AdjacentNode> adjacentNodes;



    public Node(String name) {
        this.name=name;
        this.adjacentNodes=new ArrayList<>();
    }

    public void addAdjacentNode(AdjacentNode adjacentNode) {
        adjacentNodes.add(adjacentNode);
    }

    public Integer getDistanceToNextNode(){
        return adjacentNodes.get(0).getDistance();
    }

    public List<AdjacentNode> getAdjacentNodes() {
        return adjacentNodes;
    }
}
