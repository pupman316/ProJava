package com.company;

import java.util.ArrayList;

/**
 * Created by Flores on 7/8/2017.
 */
public class Graph {
    ArrayList<Node> nodeList;
    int nodeCount;

    public Graph(){
        this.nodeList = new ArrayList<>();
        this.nodeCount = 0;
    }

    public void AddNode(String newNodeID) {
        this.nodeCount++;
        Node newNode = new Node(newNodeID);
        nodeList.add(newNode);
    }

    public Node GetNode(String theID) {
        final Node[] returner = {null};
        this.nodeList.forEach((n) -> {
            if (n.id == theID) {
                returner[0] = n;
            }
        });

        return returner[0];
    }

    public void AddEdge(String frmID, String toID, int cost) {
        final boolean[] toInList = {false};
        final boolean[] frmInList = {false};

        // Find frm and to in list
        this.nodeList.forEach(n -> {
            if (n.id == frmID) {
                frmInList[0] = true;
            }
            if (n.id == toID) {
                toInList[0] = true;
            }
        });

        if (!frmInList[0]) {
            this.AddNode(frmID);
        }

        if (!toInList[0]) {
            this.AddNode(toID);
        }

        this.nodeList.forEach(n -> {
            if (n.id == frmID) {
                n.AddNeighbor(this.GetNode(toID), cost);
            }

            if (n.id == toID) {
                n.AddNeighbor(this.GetNode(frmID), cost);
            }
        });
    }

    public ArrayList<Node> GetNodes(){
        return this.nodeList;
    }
}