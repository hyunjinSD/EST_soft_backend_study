package chap10.wildcard;

import java.util.Arrays;

public class WildCardExample {
    public static void registerPerson(Course<?> t) {
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson2(Course<? extends Student> t) {

    }

    public static void registerPerson3(Course<? super Worker> t) {

    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 4);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 4);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 4);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerPerson(personCourse);
        registerPerson(workerCourse);
        registerPerson(studentCourse);
        registerPerson(highStudentCourse);

        registerPerson2(studentCourse);
        registerPerson2(highStudentCourse);

        registerPerson3(workerCourse);
        registerPerson3(personCourse);
    }
}
