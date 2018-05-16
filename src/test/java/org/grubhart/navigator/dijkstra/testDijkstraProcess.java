package org.grubhart.navigator.dijkstra;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class testDijkstraProcess {

    @Test
    public void testInitVector(){


        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",1);
        nodo1.addAdjacentNode(adjacentNode1);

        Node node2=new Node("B");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);

        assertEquals((Integer)0, dijkstra.getDistance());

    }

    @Test
    public void testProcess_2_nodes_1_road(){

        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",1);
        nodo1.addAdjacentNode(adjacentNode1);

        Node node2=new Node("B");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);
        dijkstra.process();

        assertEquals((Integer) 1,dijkstra.getDistance());

    }

    @Test
    public void testProcess_3_nodes_1_road(){

        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",1);
        nodo1.addAdjacentNode(adjacentNode1);

        Node node2=new Node("B");
        AdjacentNode adjacentNode2 = new AdjacentNode("C",3);
        node2.addAdjacentNode(adjacentNode2);

        Node node3=new Node("C");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);
        nodes.add(node3);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);
        dijkstra.process();

        assertEquals((Integer) 4,dijkstra.getDistance());

    }

    @Test
    public void testProcess_2_roads_road_up(){

        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",1);
        AdjacentNode adjacentNode2 = new AdjacentNode("C",3);
        nodo1.addAdjacentNode(adjacentNode1);
        nodo1.addAdjacentNode(adjacentNode2);

        Node node2=new Node("B");
        AdjacentNode adjacentNode3 = new AdjacentNode("D",4);
        node2.addAdjacentNode(adjacentNode3);

        Node node3=new Node("C");
        AdjacentNode adjacentNode4 = new AdjacentNode("D",6);
        node3.addAdjacentNode(adjacentNode4);

        Node node4=new Node("D");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);
        dijkstra.process();

        assertEquals((Integer) 5,dijkstra.getDistance());

    }

    @Test
    public void testProcess_2_roads_road_down(){

        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",3);
        AdjacentNode adjacentNode2 = new AdjacentNode("C",1);
        nodo1.addAdjacentNode(adjacentNode1);
        nodo1.addAdjacentNode(adjacentNode2);

        Node node2=new Node("B");
        AdjacentNode adjacentNode3 = new AdjacentNode("D",6);
        node2.addAdjacentNode(adjacentNode3);

        Node node3=new Node("C");
        AdjacentNode adjacentNode4 = new AdjacentNode("D",4);
        node3.addAdjacentNode(adjacentNode4);

        Node node4=new Node("D");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);
        dijkstra.process();

        assertEquals((Integer) 5,dijkstra.getDistance());

    }

    @Test
    public void testGetRoute(){

        Node nodo1=new Node("A");
        AdjacentNode adjacentNode1 = new AdjacentNode("B",3);
        AdjacentNode adjacentNode2 = new AdjacentNode("C",1);
        nodo1.addAdjacentNode(adjacentNode1);
        nodo1.addAdjacentNode(adjacentNode2);

        Node node2=new Node("B");
        AdjacentNode adjacentNode3 = new AdjacentNode("D",6);
        node2.addAdjacentNode(adjacentNode3);

        Node node3=new Node("C");
        AdjacentNode adjacentNode4 = new AdjacentNode("D",4);
        node3.addAdjacentNode(adjacentNode4);

        Node node4=new Node("D");

        List<Node> nodes = new ArrayList<>();
        nodes.add(nodo1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);

        Dijkstra dijkstra=new Dijkstra();
        dijkstra.init(nodes);
        dijkstra.process();

        assertEquals("ACD",dijkstra.getRoute());

    }








}
