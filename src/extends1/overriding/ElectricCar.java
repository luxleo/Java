package extends1.overriding;

public class ElectricCar extends Car {
    /**
     * overriding: 슈퍼클래스의 메서드를 재정의 하여 클래스 탐색시
     * 부모 클래스까지 올라가지 않고 오버라이드된 서브 클래스의 메서드를 사용한다.
     *
     * overring의 제약사항:
     * 부모 클래스와 반환 타입, 매개변수의 종류와 순서가 완전히 같아야한다.
     * 부모 클래스의 메서드 보다 제한적인 접근 제한자를 사용할 수 없다.
     * 부모 클래스의 메서드가 static, final, private 키워드가 붙은 경우 재정의 할 수 없다.
     *
     * @Override 어노테이션을 명시하지 않아도 동작하지만
     * 컴파일 시점에 슈퍼클래스 메서드를 오버라이드 할 수 없는 경우 잡아주기 때문에
     * '항상 사용할 것'을 권장한다.
     */
    @Override
    public void move() {
        System.out.println("accelerate electric car more faster");
    }

    public void chargeUp() {
        System.out.println("charge up the car");
    }
}
