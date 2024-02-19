package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA interfaceA = new Child();
        interfaceA.methodA();
        interfaceA.commonMethod();

        InterfaceB interfaceB = new Child();
        interfaceB.methodB();
        interfaceB.commonMethod();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.commonMethod();
    }
}
