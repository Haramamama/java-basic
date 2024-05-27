package oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {

        // 절차 지향 프로그래밍 - 클래스
        /*
        * - MusicPlayer 를 사용하는 입장에서는 MusicPlayer 의 데이터인 volume , isOn 같은 데이터는 전혀 사용하지 않는다.
        * - MusicPlayer 를 사용하는 입장에서는 MusicPlayer 가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면 된다.
        * */

        /*
        * <캡슐화>
        - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화 라고 한다.
        * */

        // 음악 플레이어를 만들어보자.
        /*
        * 예시 출력:
          음악 플레이어를 시작합니다
          음악 플레이어 볼륨:1
          음악 플레이어 볼륨:2
          음악 플레이어 볼륨:1
          음악 플레이어 상태 확인
          음악 플레이어 ON, 볼륨:1
          음악 플레이어를 종료합니다
        * */

        MusicPlayer musicPlayer = new MusicPlayer();


        // 음악 플레이어 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeDown();
        // 음악 플레이어 상태
        musicPlayer.showStatus();
        // 음악 플레이어 끄기
        musicPlayer.off();


    }
}