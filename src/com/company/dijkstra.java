package com.company;

/**
 * Created by Flores on 7/8/2017.
 */

//public void Shortest(Node n, )

//        # def shortest(v, path):
//        #     ''' make shortest path from v.previous '''
//        #     if v.previous:
//        #         path.append(v.previous.get_id())
//        #         shortest(v.previous, path)
//        #     return
//        #
//        #

public class dijkstra {
    Graph theGraph;
    Node startNode;
    Node endNode;

    public dijkstra(Graph newGraph, Node newStart, Node newEnd){
        this.theGraph = newGraph;
        this.startNode = newStart;
        this.endNode = newEnd;
    }
}


//        # def dijkstra(agraph, start, target):
//        #     print("Dijkstra's shortest path")
//        #     # Set the distance for the start node to zero
//        #     start.set_distance(0)
//        #
//        #     # Put tuple pair into priority queue
//        #     unvisited_queue = [(v.get_distance(), v) for v in agraph.get_vertices()]
//        #     heapq.heapify(unvisited_queue)
//        #
//        #     while len(unvisited_queue):
//        #         # Pops a vertex with the smallest distance
//        #         uv = heapq.heappop(unvisited_queue)
//        #         current = uv[1]
//        #         current.set_visited()
//        #
//        #         # For next in v.adjacent
//        #         for next in current.adjacent:
//        #             # if visited, skip
//        #             if next.visited:
//        #                 continue
//        #             new_dist = current.get_distance() + current.get_weight(next)
//        #
//        #             if new_dist < next.get_distance():
//        #                 next.set_distance(new_dist)
//        #                 next.set_previous(current)
//        #                 print('Updated : current = %s next = %s new_dist = %s') \
//        #                     % (current.get_id(), next.get_id(), next.get_distance())
//        #
//        #             else:
//        #                 print('Not updated: current = %s next = %s new_dist = %s') \
//        #                     % (current.get_id(), next.get_id(), next.get_distance())
//        #
//        #         # Rebuild heap
//        #         # 1. Pop every item
//        #         while len(unvisited_queue):
//        #             heapq.heappop(unvisited_queue)
//        #         # 2. Put all vertices not visited into the queue
//        #         unvisited_queue = [(v.get_distance(), v) for v in agraph if not v.visited]
//        #         heapq.heapify(unvisited_queue)
