package poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println(String.format("cat sound %s",AnimalSoundConst.catSound));
    }

    @Override
    public void move() {
        System.out.println("cat move swiftly");
    }
}
