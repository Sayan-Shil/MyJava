package Java8.Function;

import java.util.function.Function;

public class squareOfNumbers {
    public static void main(String[] args) {
        Function<Integer,Integer> func = i -> i*i;
        for (int i = 0; i <= 50; i++) {
            System.out.println(func.apply(i));
        }
    }
}
