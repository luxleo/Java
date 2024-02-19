package extends1.super1;

/**
 * 슈퍼클래스와 같은 이름의 필드나 메서드가 있는 경우
 * 기본적으로 참조된 자식 클래스에서 찾는다.
 * 만일 슈퍼클래스의 필드나 메서드를 참조한다면 'super.' 을 통하여 부모 클래스를 참조한다.
 */
public class Child extends Parent {
    String value = "child";
    @Override
    protected void hello() {
        System.out.println("value = " + value);
    }

    public void call() {
        System.out.println("this.value = " + this.value); // this생랽 가능 child에서 찾는다
        System.out.println("super.value = " + super.value);

        super.hello();
        this.hello();
    }
}
