package chap07;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("현진", "8014-6554", 123);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
