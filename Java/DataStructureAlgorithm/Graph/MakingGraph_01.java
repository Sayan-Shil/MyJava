package DataStructureAlgorithm.Graph;

import java.util.Arrays;

public class MakingGraph_01 {

//Create New Array
public static int[][] makeArray(int row){
    return new int[row+1][row+1];
}


public static void addEdge(int[][] arr , int source, int destination){
    arr[source][destination]=1;
    arr[destination][source]=1;
}

//Add Edges
public static void main(String[] args) {
   /* Create The Graph
       1 -------2- - - -  -
       -        -         -
       -        -         -
       -        -         -
       -       3 - -- - - 4------5
       -                         -
       ---------------------------
    */

    /*
    Identify All Edges
    Number of rows = 5

    Source <--> Destination
    1 connected to 2,5
    2 Connected to 3,4
    3 connected to 4
    4 connected to 5
     */

    int[][] graph = makeArray(5);
    for (int i = 1; i < 6; i++) {
        Arrays.fill(graph[i], 0);
    }

    addEdge(graph,1,2);
    addEdge(graph,1,5);
    addEdge(graph,2,3);
    addEdge(graph,2,4);
    addEdge(graph,3,4);
    addEdge(graph,4,5);

    for (int i = 1; i<6 ; i++) {
        for(int j=1;j<6;j++){
            System.out.print(graph[i][j] +"\t");
        }
        System.out.println();
    }



}


}
