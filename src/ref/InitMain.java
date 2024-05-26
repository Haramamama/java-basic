package ref;

public class InitMain {
    public static void main(String[] args) {

        // 변수와 초기화

        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 0
        System.out.println("data.value1 = " + data.value2); // 10

        /*
        * 변수의 종류
        * 1. 멤버 변수 (클래스에 선언)
        * - 인스턴스의 멤버 변수는 인스턴스를 생성할때 자동으로 초기화된다.
        * - 숫자(0), boolean(false), String, 참조형(null)
        * - null 값은 참조할 대상이 없다는 뜻.
        * - 개발자가 초기값을 직접 지정할 수 있다.
        * 2. 지역 변수 (메서드에 선언)
        * - 매개변수도 지역변수의 한 종류이다.
        * - 특정 지역에서만 사용되는 변수
        * - 메서드가 끝나면 제거된다.
        * - 지역 변수는 항상 직접 초기화해야 한다.
        * */

        /*
        * - value1 은 초기값을 지정하지 않았지만 멤버 변수이기에 자동으로 초기화 된다.
        * 숫자는 0으로 자동 초기화된다.
        * - value2 는 초기값을 10으로 지정했기에 객체를 생성할때 10으로 초기화 된다.
        * */
    }
}
