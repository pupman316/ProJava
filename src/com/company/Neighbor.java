package com.company;

/**
 * Created by Flores on 7/9/2017.
 */
public class Neighbor {
    Node mate;
    int cost;

    public Neighbor(Node newMate, int newCost){
        this.mate = newMate;
        this.cost = newCost;
    }
}
