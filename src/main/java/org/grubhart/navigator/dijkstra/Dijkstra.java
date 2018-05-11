package org.grubhart.navigator.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    private List<Node> nodes;
    private List<Node> finalNodes;
    

    public void init(List<Node> nodes) {

        this.nodes=nodes;
        this.finalNodes=new ArrayList<>();
    }

    public void process() {

        finalNodes=nodes.subList(0,nodes.size());

    }


    public Integer getDistance() {

        Integer distance=0;

        for (Node node: finalNodes) {

            if(!node.getAdjacentNodes().isEmpty())
                distance+=node.getDistanceToNextNode();

        }

        return distance;
    }

}
