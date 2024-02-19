package access.a;

public class Access {
    private int privateInt;
    int defaultInt;
    public int publicInt;

    private void privateMethod() {
        System.out.println("privateInt = " + privateInt);
    }

    void defaultMethod() {
        System.out.println("defaultInt = " + defaultInt);
    }

    public void publicMethod() {
        System.out.println("publicInt = " + publicInt);
    }
}
