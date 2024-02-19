package poly.ex4;

/**
 * 모든 메서드가 추상메서드인 클래스를
 * 순수 추상 클래스라 한다.
 *
 * 순수 추상 클래스는 다음과 같은 특징을 갖는다.
 * 1. 상속되지 않고는 인스턴스로 생성될 수 없다.
 * 2. 클래스의 모든 메서드를 오버라이딩 하도록 강요한다.
 * 3. 주로 다형성을 구현하기 위하여 사용된다.
 *
 * 현재 자바에는 '인터페이스'로 사용되는 순수 추상 클래스를 구현한
 * '인터페이스'를 제공한다.
 */
public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move();
}
