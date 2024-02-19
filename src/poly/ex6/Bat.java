package poly.ex6;

public class Bat extends Animal implements Fly{
    @Override
    public void sound() {
        System.out.println("bat sound zzz");
    }

    @Override
    public void fly() {
        System.out.println("bat fly ppp");
    }
}
