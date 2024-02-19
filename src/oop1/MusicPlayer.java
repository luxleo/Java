package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;
    void volumeUp() {
        volume++;
    }
    void volumeDown() {
        volume--;
    }

    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }

    void showStatus() {
        System.out.println(String.format("volume : %d, isOn: %b", volume, isOn));
    }
}
