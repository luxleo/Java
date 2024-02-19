package extends1.super2;

/**
 * 부모클래스를 상속받은 자식의 생성자에는
 * 반드시 부모클래스의 생성자를 먼저 호출 해주어야한다(기본 생성자인 경우 생략 가능하다)
 * 또는 this(...)를 통하여 부모 생성자를 호출하는 생성자중 하나를 호출할 수도있다. -> ClassB참조
 */
public class ClassA {
    public ClassA() {
        System.out.println("[ClassA.ClassA]");
    }
}
