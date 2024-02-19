package poly.ex3;

/**
 * 추상 클래스는 제약 조건이 있을 뿐 일반 클래스와 같다.
 * 추상 클래스는 인스턴스화 할 수 없다.
 * 상속을 통해서만 존재할 수 있다. (상속한 자식 인스턴스와 함께 인스턴스화 한다.)
 * 추상 메서드를 가진 클래스는 반드시 추상 메서드로 선언되어야한다.
 */
public abstract class AbstractAnimal {
    /**
     * 추상 메서드는 반드시 상속하는 자식 클래스가 오버라이드 해야한다.
     */
    public abstract void sound();

    /**
     * 추상 메서드가 아니면 자식 클래스가 반드시 오버라이드 할 필요가 없다.
     */
    public void move() {
        System.out.println("animal move");
    }
}
