package chap11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 값 추가
        List<String> list = new LinkedList<>();  // Node 추가
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 총 개수 출력
        System.out.println("총 개수 : " + list.size());

        // 값 순회 하면서 출력
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
