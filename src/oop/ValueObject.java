package oop;

public class ValueObject {

    int value;

    void add(){
        value++;
        System.out.println("숫자 증가 value : " + value);
    }

    /*
    * 이 클래스에는 데이터인 value 와 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의했다.
    * 여기서 만든 add() 메서드에는 static 키워드를 사용하지 않는다.
    * - 메서드는 객체를 생성해야 호출할 수 있다.
    * - 그런데 static 이 붙으면 객체를 생성하지 않고도 메서드를 호출 할 수 있다.
    * */
}

