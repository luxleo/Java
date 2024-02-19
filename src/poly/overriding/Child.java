package poly.overriding;

public class Child extends Parent {
    String value = "Child";
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
