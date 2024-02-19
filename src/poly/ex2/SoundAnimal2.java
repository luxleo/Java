package poly.ex2;

/**
 * Animal을 상속한 자식타입의 수가 증가하여도 변하는 코드의 수가 줄었다.
 * SoundAnimal2에서는 반복문을 통하여 코드를 더욱 단축할 수 있다.
 */
public class SoundAnimal2 {
    public static void main(String[] args) {
        /*
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cow);
        soundAnimal(cat);
         */

        Animal[] animals = {new Dog(), new Cow(), new Cat()};
        for (Animal animal :
                animals) {
            soundAnimal(animal);
        }
    }
    
    public static void soundAnimal(Animal animal) {
        System.out.println("animal sound");
        animal.sound();
        System.out.println("animal sound end\n");
    }
}
