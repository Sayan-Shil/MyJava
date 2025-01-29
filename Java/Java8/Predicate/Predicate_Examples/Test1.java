package Java8.Predicate.Predicate_Examples;

import java.util.Scanner;
import java.util.function.Predicate;

// Write a program to check if a number is odd / even
public class Test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        Predicate<Integer> p = i-> i%2==1;
        System.out.println(p.test(num) ? "Odd" : "Even");
    }
}
