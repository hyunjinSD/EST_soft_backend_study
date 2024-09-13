package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        // file 읽어오는 로직
        String filename = "file1.txt";
        // AutoVlosabel.close();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            reader.readLine();
            reader.close();  // 어짜피 괄호 안에서 실행되기 때문에 close를 지워도됨)
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
    }
}
