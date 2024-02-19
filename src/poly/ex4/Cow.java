package poly.ex4;

public class Cow extends AbstractAnimal {
    /**
     * 추상 클래스를 상속하는 자식 클래스는 반드시
     * 부모 추상클래스의 추상 메서드를 오버라이드 해야한다.
     */
    @Override
    public void sound() {
        System.out.println("cow sound moo");
    }

    @Override
    public void move() {
        System.out.println("cow move slowly and heavy");
    }
}
