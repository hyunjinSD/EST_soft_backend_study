package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        list.stream()
                .map(element -> element.toUpperCase())  // ABCDE
                .forEach(System.out::println);

        // flatmap  2차원 -> 1차원
        Integer[][] array = {{3,4}, {1,2}};
        Arrays.stream(array)
                .flatMap(element -> Arrays.stream(element))
                .forEach(System.out::println);

        // flatmap
        List<String> sentences = Arrays.asList("Hello World", "Java stream");
        List<String> collect = sentences.stream()
//        String[] strArray1 = {"Hello", "World"};
//        String[] strArray2 = {"Java", "Stream"};
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect); // [Hello, World, Java, stream]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(list2);


        List<String> sentences2 = Arrays.asList("Hello:world", "Java:stream:flatMap", "Functional:programming");
        List<String> list3 = sentences2.stream()
                .flatMap(x -> Arrays.stream(x.split(":")))
                .toList();
        System.out.println(list3);


        List<List<Integer>> numbers2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> list4 = numbers2.stream()
                .flatMap(x -> x.stream())
                .toList();
        System.out.println(list4);
    }
}
