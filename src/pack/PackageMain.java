package pack;

import pack.a.Student;

public class PackageMain {
    public static void main(String[] args) {
        // 같은 이름의 클래스가 있는 경우 중복해서 import 할 수 없다.
        Student stdA = new Student();

        // 중복되는 클래스 중 하나는 전체 package를 다 적어 주어야한다.
        pack.b.Student stdB = new pack.b.Student();
    }
}
