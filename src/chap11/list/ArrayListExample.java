package chap11.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 값 추가
        List<String> list = new ArrayList<>();  // 기본적으로 10개의 배열 할당
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 총 개수 출력
        System.out.println("총 개수 : " + list.size());

        // 값 순회하면서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + i + " : " + list.get(i));
        }

        // 값 삭제
        list.remove(2);
        list.remove(2);

        for (String element : list) {
            System.out.println("\t" + element);
        }
    }
}
