package org.grubhart.navigator.dijkstra;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class testDijkstra {

    @Test
    public void testInitVector(){


        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",1);
        nodo1.addAdjacentNode(adjacentNode1);

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);

        assertEquals((Integer)0, dijkstra.getDistance());

    }


}
