package DataStructureAlgorithm.Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class MakingWeightedGraph {

    public static ArrayList<ArrayList<ArrayList<Integer>>> makeGraphList(int vertices){
        ArrayList<ArrayList<ArrayList<Integer>>> GraphList = new ArrayList<>();
        for (int i = 0; i <vertices+1 ; i++) {
            GraphList.add(new ArrayList<ArrayList<Integer>>());
        }
        return GraphList;
    }

    public static void addEdges(ArrayList<ArrayList<ArrayList<Integer>>> graphList, int source, int destination, int weight){
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        list.add(destination);
        list.add(weight);
        list2.add(source);
        list2.add(weight);

        graphList.get(source).add(list);
        graphList.get(destination).add(list2);


    }

    public static void main(String[] args) {

        ArrayList<ArrayList<ArrayList<Integer>>> Graph = makeGraphList(5);
        addEdges(Graph,1,2,6);
        addEdges(Graph,1,5,2);
        addEdges(Graph,2,3,6);
        addEdges(Graph,2,4,4);
        addEdges(Graph,3,4,7);
        addEdges(Graph,4,5,9);

        Iterator itr= Graph.iterator();;
        int i=0;
        while(itr.hasNext() && i!=6){
            System.out.print(i+"---->");
            Iterator itr2= Graph.get(i++).iterator();
            while(itr2.hasNext()){
                ArrayList<Integer> list = (ArrayList<Integer>) itr2.next();
                System.out.print("("+list.get(0)+","+list.get(1)+")");
            }
            System.out.println();
        }

    }




}

