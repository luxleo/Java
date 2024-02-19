package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceAnimal[] animals = {new Dog(), new Cow(), new Cat()};

        for (InterfaceAnimal animal :
                animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }
    public static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("sound animal start");
        animal.sound();
        System.out.println("sound animal end\n");
    }
    public static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("move animal start");
        animal.sound();
        System.out.println("move animal end\n");
    }
}
