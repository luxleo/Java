package poly.basic;

/**
 * casting -> 'cast'의 뜻이 금속 따위를 정형하다라는 뜻을 가진다.
 * casting의 두가지 종류(다운 캐스팅, 업캐스팅)이 있다.
 */
public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();

        // 업캐스팅 연산은 생략 가능하다.
        Parent poly1 = child;

        // 업캐스팅 연산을 명시적으로 할 필요는 없다. 하지않는 것을 권장한다.
        Parent poly2 = (Parent) child;
    }
}
