package poly.ex3;

/**
 * 추상 클래스와 다형성의 약점 보완
 * 상속과 오버라이드로 다형성을 구현할 때 두가지 약점이 있다.
 * 1. 특별한 기능이 없는 부모클래스를 인스턴스로 선언하기
 * 2. 상속받은 부모클래스의 구현해야할 메서드를 오버라이드 하지 않는 경우
 *
 * 추상클래스와 그것의 추상메서드로 두 약점을 보완한다.
 */
public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cow()};
        for (AbstractAnimal animal :
                animals) {
            soundAnimal(animal);
        }
    }

    public static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end\n");
    }
}
