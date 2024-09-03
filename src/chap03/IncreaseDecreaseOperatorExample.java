package chap03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++;  // 10
        ++x;  // ++11 // 12
        System.out.println("x=" + x); // x = 12

        System.out.println("----------------------");
        y--;   // 10
        --y;   // --9  // 8
        System.out.println("y=" + y); // y = 8

        System.out.println("----------------------");
        z = x++;    // z = 12
        System.out.println("z=" + z); // z = 12 / x를 읽어들이기만 했기 때문에
        System.out.println("x=" + x); // x = 13

        System.out.println("----------------------");
        z = ++x;   // z = 14   x = 14
        System.out.println("z=" + z); // 14
        System.out.println("x=" + x); // 14

        System.out.println("----------------------");
        z = ++x + y++;   // ( x= 15) + (y = 8) = z = 23
        System.out.println("z=" + z); // z = 23
        System.out.println("x=" + x); // x = 15
        System.out.println("y=" + y); // y = 9
    }
}