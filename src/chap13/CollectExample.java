package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3 ,4 ,5 ,5 ,5 );

        Map<Integer, Long> collected = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        collected.forEach((key, value) ->
                System.out.println(key + " : " + value + "개"));
    }
}
