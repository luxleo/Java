package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
        gasCar.openDoor();

        ElectricCar electricCar = new ElectricCar();
        electricCar.chargeUp();
        electricCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
