package ref;

/**
 * 참조형의 경우 파라미터로 참조값을 전달 받을 수도 있지만
 * 반대로 참조값인 인스턴스를 반환할 수도 있다.
 */
public class MethodApply2 {
    public static void main(String[] args) {
        Student student1=createStudent("s1",10,20);
        Student student2=createStudent("s2",10,20);

        showStudent(student1);
        showStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void showStudent(Student student) {
        System.out.println(String.format("name: %s, age: %d, grade: %d",
                student.name,
                student.age,
                student.grade));
    }
}
