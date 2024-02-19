package constructor;

public class Member {
    String name;
    int age;

    Member(String name) {
        this(name, 10);
    }

    Member(String name, int age) {
        System.out.println(String.format("새로운 멤버 생성 이름 : %s, 나이 : %d", name, age));
        this.name = name;
        this.age = age;
    }
}
