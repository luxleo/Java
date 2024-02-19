package extends1.ex2;

/**
 * 슈퍼클래스를 다중으로 상속 받는 경우 서로 다른 슈퍼클래스에 공통된 메서드가 있고
 * 이를 서브 클래스가 사용하는 경우 어떤 슈퍼 클래스의 메서드인지 판단하기 어렵고
 * 클래스 상속 구조도가 복잡해지는 경향을 피하기 위하여
 * 자바는 extends키워드를 하나의 슈퍼클래스만 적용되도록 제한하였다.
 */
public class ElectricCar extends Car {
    public void chargeUp() {
        System.out.println("charge up the car");
    }
}
