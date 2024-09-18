package chap10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
            // 제네릭
            ArrayList<String> list = new ArrayList<>();
            list.add("10");
            list.add("12.45");
            list.add("문자열");
// 확실한 타입체크를 위해 제네릭을 사용 변환 필요 없음
            String str = list.get(2);

            // 제네릭 X
            ArrayList list2 = new ArrayList();
            list2.add("10");
            list2.add(12.45);
            list2.add("문자열");


            // 제네릭을 하면 이렇게 타입변환 체크를 안해도 됨.
            Object object = list2.get(2);
            int a = Integer.parseInt((String) object);
        System.out.println(a + 1);
    }
}
