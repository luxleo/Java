package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println(String.format("dog sound %s",AnimalSoundConst.dogSound));
    }

    @Override
    public void move() {
        System.out.println("dog move dynamically");
    }
}
