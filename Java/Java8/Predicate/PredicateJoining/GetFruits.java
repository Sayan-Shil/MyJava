package Java8.Predicate.PredicateJoining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

class Fruit {
    String name;
    double cost;
    Fruit(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return name;
    }

}

public class GetFruits {
    public static ArrayList<Fruit> checkPredicate(Predicate<Fruit> p , ArrayList<Fruit> al){
        ArrayList<Fruit> fl = new ArrayList<>();
        for( Fruit f : al){
            Boolean b = p.test(f) ? fl.add(f) : null;
        }
        return fl;
    }

    public static Fruit fillFruit(String name, double cost){
        return new Fruit(name,cost);
    }

    public static void main(String[] args) {
        ArrayList<Fruit> al = new ArrayList<>();
        al.add(fillFruit("Apple", 89.50));
        al.add(fillFruit("Banana", 50.00));
        al.add(fillFruit("Mango", 120.75));
        al.add(fillFruit("Orange", 60.30));
        al.add(fillFruit("Pineapple", 150.00));
        al.add(fillFruit("Strawberry", 200.25));
        al.add(fillFruit("Watermelon", 45.00));
        al.add(fillFruit("Grapes", 90.50));
        al.add(fillFruit("Peach", 130.00));
        al.add(fillFruit("Cherry", 300.00));
        al.add(fillFruit("Guava", 55.75));
        al.add(fillFruit("Kiwi", 110.40));
        al.add(fillFruit("Blueberry", 250.60));
        al.add(fillFruit("Blackberry", 270.90));
        al.add(fillFruit("Papaya", 40.00));
        al.add(fillFruit("Litchi", 180.00));
        al.add(fillFruit("Pomegranate", 130.80));
        al.add(fillFruit("Coconut", 65.50));
        al.add(fillFruit("Dragonfruit", 350.00));
        al.add(fillFruit("Pear", 85.40));
        System.out.println(al);


        // "Write a Java program that filters an ArrayList of fruits using a Java8.Predicate to get only those fruits whose cost is less than 300 and print the resulting list."
        Predicate<Fruit> costlessthan300 = f -> f.cost<300;
        System.out.println(checkPredicate(costlessthan300,al));

        //Return a list of fruit names that start with the letter P.
        Predicate<Fruit> isstartwiths = f -> f.name.charAt(0) == 'P';
        System.out.println(checkPredicate(isstartwiths,al));

        //Return a list of fruit names where:
        //
        //The cost is less than 150.
        //The fruit name contains more than 5 characters.

        Predicate<Fruit> logic3 = f -> f.cost<150 && f.name.length()>5;
        System.out.println(checkPredicate(logic3,al));

        //Return the names of fruits that satisfy the following conditions:
        //
        //The cost is between 100 and 300.
        //The name has an even number of characters.
        Predicate<Fruit> logic4 = f -> f.cost>100 && f.cost<300;
        Predicate<Fruit> logic5 = f -> (f.name.length())%2==0;

        System.out.println(checkPredicate(logic4.and(logic5),al));

        // Return all Fruit Names in descending order of Cost
        Collections.sort(al,(a,b)-> (a.cost>b.cost)?-1 : (a.cost<b.cost)?1:0);
        for( Fruit f : al){
            System.out.print(f.name +" ");
            System.out.println(f.cost);
        }

        System.out.println();

        // For a 2000 Rs. How many fruits can be bought ?
        for( Fruit f : al){
            System.out.print(f.name +" ");
            System.out.println((byte)(2000/f.cost)+ " pcs");
        }


    }
}
