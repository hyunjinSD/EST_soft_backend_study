package chap07.employee;

public class EmployeeExample {
    public static void main(String[] args) {
        // 객체 생성
        FullTimeEmployee alice = new FullTimeEmployee("Alice",6000);
        PartTimeEmployee bob = new PartTimeEmployee("Bob's", 1000,4);

        //출력( 객체 내부 요소들 호출)
        System.out.println(alice.getName() + "'s Salary" + alice.calculateSalary());
        System.out.println(bob.getName() + "'s Salary" + bob.calculateSalary());

//        Employee employee = new Employee(); // 추상클래스로 객체 생성 불가

        //객체 지향 특징 - 다형성
        // 자식 클래스의 생성자로 호출가능
        Employee fullTimeEmployee = new FullTimeEmployee("", 45);
        Employee partTimeEmployee = new PartTimeEmployee("", 1000,4);

    }
}
