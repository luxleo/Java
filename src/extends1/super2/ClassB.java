package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        this(a, 0);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println(String.format("[ClassB.ClassB] a = %d, b = %d",a,b));
    }
}
