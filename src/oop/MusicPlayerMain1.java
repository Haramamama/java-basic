package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        // 절차 지향 프로그래밍 vs 객체 지향 프로그래밍
        /*
        * 1. 절차 지향 프로그래밍
        * - 이름 그대로 절차를 지향한다.
        * - 실행 순서를 중요하게 생각하는 것이 아니다.
        * - 프로그램의 흐름을 순차적으로 따르며 처리하는 방식을 말한다.
        * - '어떻게' 를 중심으로 프로그래밍한다.
        * 2. 객체 지향 프로그래밍
        * - 이름 그대로 객체를 지향한다.
        * - 객체들 간의 상호작용을 중심으로 프로그래밍 하는 방식이다.
        * -'무엇을' 을 중심으로 프로그래밍한다.
        * */

        /*
        * 객체란 ?
        * - 세상의 모든 사물
        * - 자바에서는 데이터와 기능
        * */

        /*
        * 두 프로그래밍의 큰 차이점 ?
        * - 절차지향은 데이터와 해당 데이터에 대한 처리 방식이 분리되어있지만
        * - 객체지향은 데이터와 그 데이터에 대한 메서드가 하나의 객체 안에 포함되어있다.
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

        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON , 볼륨 : " + volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
