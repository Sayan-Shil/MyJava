package DataStructureAlgorithm.Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class MakingGraph_02 {

    public static ArrayList<ArrayList<Integer>> makeGraphList(int vertices){
        ArrayList<ArrayList<Integer>> GraphList = new ArrayList<>();
        for (int i = 0; i <vertices+1 ; i++) {
           GraphList.add(new ArrayList<Integer>());
        }
        return GraphList;
    }

    public static void addEdges(ArrayList<ArrayList<Integer>> graphList, int source, int destination){
        graphList.get(source).add(destination);
        graphList.get(destination).add(source);
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> Graph = makeGraphList(5);
        addEdges(Graph,1,2);
        addEdges(Graph,1,5);
        addEdges(Graph,2,3);
        addEdges(Graph,2,4);
        addEdges(Graph,3,4);
        addEdges(Graph,4,5);

        Iterator itr= Graph.iterator();;
        int i=0;
        while(itr.hasNext() && i!=6){
            System.out.print(i+"---->");
            Iterator itr2= Graph.get(i++).iterator();
            while(itr2.hasNext()){
                System.out.print(itr2.next()+",");
            }
            System.out.println();
        }

    }




}
