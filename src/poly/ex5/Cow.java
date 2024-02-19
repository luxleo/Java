package poly.ex5;

public class Cow implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println(String.format("cow sound %s",AnimalSoundConst.cowSound));
    }

    @Override
    public void move() {
        System.out.println("cow move slow");
    }
}
