package ref;

public class NullMain2 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData = " + bigData);
        System.out.println("bigData.data = " + bigData.data);
        // NullPointerException !! -> null에 .(dot)연산을 했을때 발생한다.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
