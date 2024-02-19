package access;

/**
 * 만일 volume을 private 접근 제한자로 두지 않는다면
 * 100 이상의 볼륨의 상태가 될 수 없다는 것에 위배 한다.
 * 따라서 private 접근 제한자로 두고 진행 하여야 한다.
 */
public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("volume can not bigger than 100");
            return;
        }
        volume++;
    }
}
