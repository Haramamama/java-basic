package oop;

public class ValueObjectMain {

    public static void main(String[] args) {

        ValueObject valueObject = new ValueObject();

        valueObject.add();
        valueObject.add();
        valueObject.add();

        System.out.println("최종 숫자 : " + valueObject.value);

        /*
        * - 클래스는 속성 (데이터, 멤버 변수) 과 기능 (메서드) 을 정의할 수 있다.
        * - 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근 할 수 있다.
        * - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
        * */

    }
}



