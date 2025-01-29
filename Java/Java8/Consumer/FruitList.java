package Java8.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
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
        return name +" --> "+ cost;
    }

}

public class FruitList {
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

        // Increase Every Fruit Cost 25% which are greater than cost of 200

        Predicate<Fruit> p = i -> i.cost > 200;
        Consumer<Fruit> c = a ->{
            if(p.test(a)){
                a.cost+=(a.cost*0.25);
                System.out.println("Price Changes in -" +a.name);
            }
        } ;

        al.forEach(c);
        System.out.println(al);

    }
}
