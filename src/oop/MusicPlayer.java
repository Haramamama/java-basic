package oop;

public class MusicPlayer {

    /*
    * 음악 플레이어를 만들어보자.
      속성: volume , isOn
      기능: on() , off() , volumeUp() , volumeDown() , showStatus()
    * */

    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    /*
    * MusicPlayer 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의했다.
    * 이제 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용할 수 있다.
    * */
}
