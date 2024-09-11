package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilelOSample2 {
    public static void main(String[] args) {

    //파일 읽어오는 코드
    int b = Integer.parseInt(args[0]);

    String file = System.getProperty("user.dir");
    String filename = file + "file1.txt";
    try ( BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
        int result = 5 / b ; //ArithmeticException 발생 가능
        System.out.println(result);

//        BufferedReader reader = new BufferedReader(new FileReader("file.txt")
        System.out.println(reader.readLine());
    } catch (FileNotFoundException | ArithmeticException e) {
        System.out.println("Exception 발생");
    } catch (IOException e) {
        System.out.println("IOException 발생");
    } finally {
        System.out.println("bye"); // 예외 발생해도 실행하고 싶은 코드
    }
    }
}
