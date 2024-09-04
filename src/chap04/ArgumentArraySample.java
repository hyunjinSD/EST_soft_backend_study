package chap04;

import java.util.ArrayList;

public class ArgumentArraySample {
    public static void main(String[] args) {
        for(int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

        System.out.println("------------");

        //for each 변환
        for(String arg : args) {
            System.out.println(arg);
        }

        System.out.println("------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            System.out.println(i);
        }
    }


}
