package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();

        ElectricCar electricCar = new ElectricCar();
        electricCar.chargeUp();
        electricCar.move();
    }
}
