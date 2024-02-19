package extends1.access.parent;

public class Parent {
    private int privateValue;
    int defaultValue;
    protected int protectedValue;
    public int publicValue;

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
}
