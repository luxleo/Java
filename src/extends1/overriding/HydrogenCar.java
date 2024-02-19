package extends1.overriding;

/**
 * extends 키워드는 상속받는 슈퍼클래스(부모 클래스)의 기능을 '확장'한다는
 * 의미를 갖는다.
 */
public class HydrogenCar extends Car {
    public void fillHydrogen() {
        System.out.println("fill hydrogen into car");
    }
}
