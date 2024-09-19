package chap10.wildcard;

public class CourseTypeExample {
    public static void main(String[] args) {

        Course<Person> personCourse = new Course<>("일반과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 4);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 4);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정",4);
        highStudentCourse.add(new HighStudent("고등학생"));
    }
}
