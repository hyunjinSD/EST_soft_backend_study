package chap09;

public class FileStream implements AutoCloseable {
    private  String fileName;

    FileStream(String fileName) {
        this.fileName = fileName;
    }

    void read() throws Exception {
        System.out.println("FileStream.read() 호출");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close() 메소드 호출!");
    }
}
