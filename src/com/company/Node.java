package com.company;
import java.util.*;

/**
 * Created by Flores on 7/8/2017.
 */
public class Node{
    // Defining Fields
    String id;
    ArrayList<Neighbor> adjacent;
    int weight;
    boolean visited;
    Node previous;

    Node(String newID){
        this.id = newID;
        this.adjacent = new ArrayList<Neighbor>();
        this.weight = 999;
        this.visited = false;
        this.previous = null;
    }

    protected void AddNeighbor(Node newNeighbor, int newCost){
        Neighbor newAdjacent = new Neighbor(newNeighbor, newCost);
        this.adjacent.add(newAdjacent);
    }

    protected ArrayList<Neighbor> GetConnections(){
        return this.adjacent;
    }

    protected int GetWeight(){
        return this.weight;
    }

    protected void SetWeight(int newWeight){
        this.weight = newWeight;
    }

    protected void SetPrevious(Node prev){
        this.previous = prev;
    }

    protected void SetVisited(){
        this.visited = true;
    }

    // MUST FIND A MORE EFFICIENT WAY TO DO THIS
//    public String toString2(){
//        return (this.id + " is adjacent to " + this.adjacent.toString());
//    }

    public String toString(){
        final String[] returnMe = {"*" + this.id + " is adjacent to "};

        this.adjacent.forEach((n)-> returnMe[0] += n.mate.id + "(" + n.cost + ") & ");

        return returnMe[0].substring(0, returnMe[0].length() - 3);
    }



//    this.nodeList.forEach(n -> {
//        if (n.id == frmID) {
//            frmInList[0] = true;
//        }
//        if (n.id == toID) {
//            toInList[0] = true;
//        }
//    });
}



    //        def get_nodes(self):
    //        return self.node_dict





