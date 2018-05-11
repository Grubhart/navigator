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



    public String getName() {
        return name;
    }

    public AdjacentNode getNearestNode(){

        Integer distance=0;
        AdjacentNode nearestAdjacentNode=null;
        for (AdjacentNode node: adjacentNodes) {

            if(distance.equals(0) || distance>node.getDistance() ) {
                nearestAdjacentNode=node;
                distance=nearestAdjacentNode.getDistance();
            }
        }

        return nearestAdjacentNode;

    }

}
