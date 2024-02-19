package poly.car1;

/**
 * 객체 지향 설계 원칙중 OCP를 준수하였다.
 * 서버 측 (Car) 역할의 구현체의 증가가 -> open
 * 클라이언트(Driver)의 코드를 변경 시키지 않는다. -> closed
 *
 * 즉 역할의 구현의 증가에는 열려있고 -> open
 * 그에 따른 클라이언트의 코드 변경에는 닫혀있다. -> closed
 */
public class DriveCar {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.setCar(new K3Car());
        driver.drive();

        driver.setCar(new Model3Car());
        driver.drive();
    }
}
