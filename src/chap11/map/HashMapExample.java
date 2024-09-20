package chap11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. map 객체 선언, keym value 값 추가
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("홍길동", 10);
        hashmap.put("윈터", 20);
        hashmap.put("윈터", 30);

        System.out.println(hashmap.get("key"));
        System.out.println(hashmap.getOrDefault("key", 0));

        System.out.println(hashmap.size());

        // 2. key, value 순회하면서 출력 -> keySet(), entrySet()
        Set<String> keySet = hashmap.keySet();
        for (String key : keySet) {
            Integer value = hashmap.get(key);
            System.out.println(key + " : " + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
