package poly.ex4;

/**
 * 인터페이스로서 역할을 하는 순수 추상 메서드를 이용하여 제약사항을 더하여 다형성을 더욱 강화한다.
 */
public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cow()};

        for (AbstractAnimal animal :
                animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("sound animal start");
        animal.sound();
        System.out.println("sound animal end\n");
    }
    public static void moveAnimal(AbstractAnimal animal) {
        System.out.println("move animal start");
        animal.sound();
        System.out.println("move animal end\n");
    }
}
