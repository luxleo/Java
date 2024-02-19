package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student(); // class1.Student@30f39991 -> package + class + @ + 참조값
        student1.name = "student1";
        student1.age = 2;
        student1.grade = 3;

        System.out.println("메모리 참조 변수 : "+ student1);

    }
}
