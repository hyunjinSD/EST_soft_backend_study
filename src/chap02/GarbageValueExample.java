package chap02;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte a = 127;
        int b = 127;

        for (int i = 0; i < 5; i++) {
            a++;
            b++;
            System.out.println(i + "a = " + a);
            System.out.println(i + "b =" + b);
        }
    }

}
