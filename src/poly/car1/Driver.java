package poly.car1;

/**
 * 다형성의 핵심인 객체간의 협력의 관점에서
 * 역할 보다 구현체에 의존하면 구현체(Server)가 증가할 때마다
 * 클라이언트(Driver)의 코드도 변경이 일어난다.
 */
public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("모종의 차를 획득하였다.");
        this.car = car;
    }

    public void drive() {
        car.startEngine();
        car.accelerate();
        car.offEngine();
        System.out.println();
    }
}
