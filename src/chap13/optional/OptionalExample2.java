package chap13.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        double result = optionalDouble.orElse(0.0);
        System.out.println(result);
    }
}
