package poly.ex2;

/**
 * Animal을 상속한 자식타입의 수가 증가하여도 변하는 코드의 수가 줄었다.
 * SoundAnimal2에서는 반복문을 통하여 코드를 더욱 단축할 수 있다.
 */
public class SoundAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cow);
        soundAnimal(cat);
    }

    /**
     * 부모타입으로 참조형이 넘어와도 '오버라이드'의 '자식타입 최우선 참조'로 인하여
     * Animal의 sound를 오버라이딩한 자식인스턴스의 메서드를 호출할 수 있고
     * 비슷한 클래스의 하나의 참조형으로 참조할 수 있는 다형성의 위력을 증폭시킨다.
     * @param animal
     */
    public static void soundAnimal(Animal animal) {
        System.out.println("animal sound");
        animal.sound();
        System.out.println("animal sound end\n");
    }
}
