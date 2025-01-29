package Java8.StreamsAPI.Map;

import java.util.Arrays;

public class Mapping {
    public static void main(String[] args) {
        // Mapping means to do operations on entire list....
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};
        Arrays.stream(arr).map((b)-> b*b);
    }
}
