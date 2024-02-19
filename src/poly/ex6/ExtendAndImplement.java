package poly.ex6;

public class ExtendAndImplement {
    public static void main(String[] args) {
        Animal[] animals = {new Bat(), new Cat(), new Duck()};
        for (Animal animal :
                animals) {
            allMove(animal);
        }
    }

    public static void allMove(Animal animal) {
        animal.sound();
        if(animal instanceof Fly fly)
            fly.fly();
        if(animal instanceof Swim swim)
            swim.swim();
        System.out.println();
    }
}
