package poly.diamond;

/**
 * 인터페이스의 메서드는 추상 메서드이다. 즉 부모 클래스에서 메서드가 구현되어있지 않다.
 * 상속 받은 자식 클래스가 오버라이드를 통해 구현한다.
 *
 * 오버라이드는 다형성 참조로 부모타입으로 받더라도 항상 오버라이드한 자식 클래스의 메서드를 호출한다.
 * 따라서 다이아몬드 문제가 발생하지 않으므로 다중 상속이 가능하다.
 */
public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void commonMethod() {
        System.out.println("Child.commonMethod");
    }
}
