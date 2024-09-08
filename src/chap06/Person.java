package chap06;

public class Person {
    final String nation = "Korea";
    String name;

    Person(String name) {
        // 생성자에서도 final 필드 초기화도 가능
        // this.nation = "Korea";
        this.name = name;
    }
}
