package poly.basic;

/**
 * 다형적 참조의 의의는 하나의 타입으로 여러 타입을 참조할 수 있다는 것이다.
 * 다형적 참조는 슈퍼타입은 서브타입의 속성과 메서드를 참조할 수 없다는 한계를 가진다.
 * 이 한계를 극복하는 방법은 캐스팅이다.
 */
public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        poly.parentMethod();

        // 자식은 부모를 품을 수 없다.
        //Child child = new Parent();

        // 부모는 자식의 속성과 메서드를 참조할 수 없다.
        //poly.childMethod(); -> 컴파일 에러 발생
    }
}
