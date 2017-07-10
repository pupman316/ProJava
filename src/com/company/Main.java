package com.company;

import java.io.IOException;
import java.lang.System;
import java.io.Console;

// Comment added 7-6-17 @ 9:57
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        BaseEntity beOne = new BaseEntity("Bart", 16);
//
//        System.out.print(beOne.TakeDamage(12));
//
//        // Handles the "pause" so output can be seen before window closes
////        try {
////            System.in.read();
////        }
////        catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//}

public class Main{

    public static void main(String[] args){

        try {
            System.out.print("SHORTEST PATH! Oh Yeah!\n");

//            Node testy = new Node("a");
//            Node testy2 = new Node("b");
//
//            testy.AddNeighbor(testy2, 20);
//            testy2.AddNeighbor(testy, 20);
//
//            System.out.print(testy.toString() + "\n");
//            System.out.print(testy2.toString() + "\n\n");

            Graph g = new Graph();

            g.AddNode("a");
            g.AddNode("b");
            g.AddNode("c");
            g.AddNode("d");
            g.AddNode("e");
            g.AddNode("f");
            g.AddEdge("a", "b", 7);
            g.AddEdge("a", "c", 9);
            g.AddEdge("a", "f", 14);
            g.AddEdge("b", "c", 10);
            g.AddEdge("b", "d", 15);
            g.AddEdge("c", "d", 11);
            g.AddEdge("c", "f", 2);
            g.AddEdge("d", "e", 6);
            g.AddEdge("e", "f", 9);

            System.out.print("Graph data:");
            System.out.print(g.GetNodes());
        }
        catch (Exception ex) {
            System.out.print("\n\nUh-Oh! An exception occurred! See below:\n\n");
            System.out.print(ex.getCause());
        }

        //*******************************************

//    #
//    # dijkstra(g, g.get_vertex('a'), g.get_vertex('e'))
//    #
//    # target = g.get_vertex('e')
//    # path = [target.get_id()]
//    # shortest(target, path)
//    # print('The shortest path : %s') % (path[::-1])
    }
}
