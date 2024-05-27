package oop;

public class ValueDataMain {
    public static void main(String[] args) {

        // 클래스와 메서드

        /*
        * ValueData 라는 인스턴스를 생성하고 외부에서 ValueData.value 에 접근해 숫자를 하나씩 증가시키는 단순한 코드이다.
        * 데이터인 value 와 value 의 값을 증가시키는 기능인 add() 메서드가 서로 분리되어 있다.
        * */

        ValueData valueData = new ValueData();

        add(valueData);
        add(valueData);
        add(valueData);

        System.out.println("최종 숫자 : " + valueData.value);

    }
    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
