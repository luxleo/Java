package oop1;

/**
 * 데이터의 값(클래스 필드), 데이터 변환 메서드를 캡슐화 함으로써
 * 각각의 변화가 다른 코드에 영향을 미치지 않는다.
 *
 * 데이터와 그 변화시키는 메서드를 한데 묶어 객체 지향을 달성한다.
 */
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 볼륨 증가
        player.volumeUp();
        player.showStatus();

        // volume down
        player.volumeDown();
        player.showStatus();

        // turn On
        player.turnOn();
        player.showStatus();

        //turn off
        player.turnOff();
        player.showStatus();
    }

}
