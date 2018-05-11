package org.grubhart.navigator.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    private List<Node> nodes;
    private List<AdjacentNode> finalNodes;
    

    public void init(List<Node> nodes) {

        this.nodes=nodes;
        this.finalNodes=new ArrayList<>();
    }

    public void process() {

        String lastNode=nodes.get(0).getName();
        for (Node node: nodes) {

            if(lastNode.equals(node.getName())) {
                AdjacentNode adjacentNode = node.getNearestNode();
                if (adjacentNode != null) {
                    finalNodes.add(adjacentNode);
                    lastNode=adjacentNode.getName();
                }
            }
        }



    }



    public Integer getDistance() {
        Integer distance=0;

        for (AdjacentNode node: finalNodes) {

                distance+=node.getDistance();

        }
        return distance;
    }

}
