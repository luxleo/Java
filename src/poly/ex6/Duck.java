package poly.ex6;

public class Duck extends Animal implements Fly, Swim {

    @Override
    public void sound() {
        System.out.println("duck sound kwak");
    }

    @Override
    public void fly() {
        System.out.println("duck fly ppp");
    }

    @Override
    public void swim() {
        System.out.println("duck swim pi pi pi");
    }
}
