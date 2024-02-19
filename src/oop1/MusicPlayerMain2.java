package oop1;

/**
 * 데이터를 묶기는 하였지만 그 데이터를 다루는 메서드와 캡슐화를 진행하지 않은
 * 절차 지향적으로 진행하였다.
 *
 * 데이터가 변환 하면 데이터 변환 메서드가 전체적으로 영향을 받는다.
 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();
        // 볼륨 증가
        volumeUp(player);
        showStatus(player);

        // volume down
        volumeDown(player);
        showStatus(player);

        // turn On
        turnOn(player);
        showStatus(player);

        //turn off
        turnOff(player);
        showStatus(player);
        
    }

    static void volumeUp(MusicPlayerData player) {
        player.volume++;
    }
    static void volumeDown(MusicPlayerData player) {
        player.volume--;
    }

    static void turnOn(MusicPlayerData player) {
        player.isOn = true;
    }
    static void turnOff(MusicPlayerData player) {
        player.isOn = false;
    }

    static void showStatus(MusicPlayerData player) {
        System.out.println(String.format("volume : %d, isOn: %b", player.volume, player.isOn));
    }
}
