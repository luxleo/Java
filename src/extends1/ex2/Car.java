package extends1.ex2;

/**
 * 여러 클래스간 공통의 기능이나 구조가 있는 경우 이를 추상화하여 슈퍼클래스(부모 클래스)로 둔다.
 * 상속 받는 클래스는 서브 클래스(자식 클래스)라고 한다.
 */
public class Car {
    public void move() {
        System.out.println("move the car");
    }
}
