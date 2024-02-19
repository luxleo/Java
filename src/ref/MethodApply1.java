package ref;

/**
 * MethodChange1에서 본 바와 같이
 * 함수 파라미터도 자바 변수할당의 대원칙을 따른다.
 * 따라서 함수를 이용하여 객채의 상태를 변화 시키거나,
 * 상태값을 조회하는데 사용하는 템플릿을 만들어 중복되는 코드를 줄일 수 있다.
 */
public class MethodApply1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"s1",10,20);

        Student student2 = new Student();
        initStudent(student2,"s2",10,20);

        showStudent(student1);
        showStudent(student2);
    }

    static void initStudent(Student st, String name, int age, int grade) {
        st.name = name;
        st.age = age;
        st.grade = grade;
    }

    static void showStudent(Student student) {
        System.out.println(String.format("name: %s, age: %d, grade: %d",
                student.name,
                student.age,
                student.grade));
    }
}
