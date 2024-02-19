package poly.overriding;

/**
 * 오버라이딩은 단순히 재정의를 넘어서 호출시 '최우선 순위'를 가진다.
 * 다형성은 다형적 참조와 오버라이딩을 통하여 완성된다.
 */
public class OverRidingMain {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 부모타입으로 다형적 참조를 하고 있으므로 부모의 변수가 호출..
        System.out.println("poly.value = " + poly.value);

        // 놀랍게도 자식인스턴스의 메소드를 호출한다. 부모형을 참조하고 있어 부모 인스턴스의 method가 호출 될것 같지만..
        poly.method();
    }
}
