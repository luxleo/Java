package poly.ex5;

/**
 * 순수 추상 메서드는 언제든 추상 메서드가 아닌 일반 메서드가 추가 될수있으나
 * 인터페이스는 그렇지 않다.
 *
 * 인터페이스를 상속한 모든 자식 클래스는 인터페이스의 추상 메서드를 '구현'해야하기에
 * implements 로 상속받는다.
 *
 * 인터페이스의 멤버 변수는 public static final 으로 전역적 상수 취급하고
 * 인터페이스의 메서드는 public abstract 로 추상 메서드이다. ( java 8 -> default로 메서드 바디 구현 가능,
 * java 9 -> private 가능 // 그러나 하위 호완성과 관련되어있으므로 인터페이스의 큰 의의에 집중하는것이 맞다.)
 *
 * 인터페이스는 UML에서 점선으로 표시한다.
 * 단순 상속은 실선이다.
 */
public interface InterfaceAnimal {
    void sound(); // 기본적으로 public abstract이다 (생략가능)

    public abstract void move();
}
