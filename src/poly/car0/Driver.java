package poly.car0;

/**
 * 다형성의 핵심인 객체간의 협력의 관점에서
 * 역할 보다 구현체에 의존하면 구현체(Server)가 증가할 때마다
 * 클라이언트(Driver)의 코드도 변경이 일어난다.
 */
public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car car) {
        if(model3Car != null)
            model3Car = null;
        System.out.println("k3 차를 획득하였다.");
        k3Car = car;
    }

    public void setModel3Car(Model3Car car) {
        if(k3Car != null)
            k3Car = null;
        System.out.println("Model3 를 획득하였다.");
        model3Car = car;
    }

    public void drive() {
        if (k3Car != null) {
            System.out.println("drive k3 car");
            k3Car.startEngine();
            k3Car.accelerate();
            k3Car.offEngine();
        } else if (model3Car != null) {
            System.out.println("drive model3 car");
            model3Car.startEngine();
            model3Car.accelerate();
            model3Car.offEngine();
        }
        System.out.println();
    }
}
