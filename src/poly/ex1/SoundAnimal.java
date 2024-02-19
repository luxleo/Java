package poly.ex1;

/**
 * 다형성을 지킬수 없다면 다양한 클래스를 공통의 타입으로 참조할 수 없기 때문에
 * 새로운 클래스가 생길때마다 공통의 로직을 또 작성해주어야한다.
 * 즉 하나의 클래스가 추가 되는것에 대한 여파가 커진다.
 */
public class SoundAnimal {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();

        soundCow(cow);
        soundDog(dog);
    }

    public static void soundCow(Cow cow) {
        System.out.println("animal sound");
        cow.sound();
        System.out.println("animal sound end\n");
    }

    public static void soundDog(Dog dog) {
        System.out.println("animal sound");
        dog.sound();
        System.out.println("animal sound end\n");
    }
}
