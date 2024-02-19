package class1;

/**
 * 참조형인 스튜던트 클래스를 배열에 할당할때
 * 새로운 인스턴스를 만들어 반환하는 것이 아니라
 * 기존에 할당된 참조값만 복사하여 할당한다.
 */
public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 17;
        Student student2 = new Student();

        Student[] students = new Student[]{student1, student2};
        for (Student student :
                students) {
            System.out.println(student.age);
        }
    }
}
