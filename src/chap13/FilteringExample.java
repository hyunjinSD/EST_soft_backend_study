package chap13;

import java.util.Arrays;
import java.util.List;

/**
 *  Stream 요소 필터링
 */

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "b", "b", "c", "c", "a");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> sentences = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        sentences.stream()
                .filter(x -> x.startsWith("김"))
                .distinct()
                .forEach(System.out::println);
    }
}
