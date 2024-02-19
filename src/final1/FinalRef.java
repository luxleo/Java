package final1;

public class FinalRef {
    public static void main(String[] args) {
        final Data data = new Data();

        // final에 참조값을 재할당 할 수 없으므로 불가능하다.
        //data = new Data();

        //참조가 가르키는 인스턴스의 멤버 변수는 final이 아니기에 재할당이 가능하다.
        data.value = 10;
    }
}
class Data{
    int value;
}
