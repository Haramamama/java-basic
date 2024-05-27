package oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        // 절차 지향 프로그래밍 - 메서드 추출
        /*
        * 메서드 기능으로 인해 각각의 기능이 모듈화 되었다. (모듈화 = 레고 블럭이라고 생각하자.)
        * - 중복 제거 : 로직 중복 제거, 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
        * - 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
        * - 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.
        * */

        /*
        * 절차 지향 프로그래밍의 한계
        * - 데이터와 기능의 분리로 인해 오류를 쉽게 낼 수 있다.
        * - 유지보수 관점에서 관리 포인트가 2곳으로 늘어난다.
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

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON , 볼륨 : " + data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
