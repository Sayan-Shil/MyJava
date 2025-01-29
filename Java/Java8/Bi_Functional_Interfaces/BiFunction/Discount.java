package Java8.Bi_Functional_Interfaces.BiFunction;

import java.util.Scanner;
import java.util.function.BiFunction;

//Write a program in Java where you use a BiFunction to compute the total cost of an item after applying a discount.
// The inputs to the BiFunction should be the price of the item (a double) and the discount percentage (an integer),
// and the output should be the final price (a double).
public class Discount {
    public static void main(String[] args) {
        BiFunction<Double,Double,Double> bf = (price,discount) -> price-=(price*discount)/100;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Price ->");
        Double price = sc.nextDouble();
        System.out.println("Enter Discount (%) ->");
        Double discount = sc.nextDouble();
        System.out.println("The Price To be--> \n" +bf.apply(price,discount));
    }
}
