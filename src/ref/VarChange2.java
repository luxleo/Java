package ref;

/**
 * 참조형 데이터를 할당할때
 * 참조값을 복사하여 전달한다.
 */
public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        //dataA와 dataB가 참조하는 인스턴스는 같다.

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
    }
}
