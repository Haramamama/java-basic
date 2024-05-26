package ref;

public class VarChange3 {
    public static void main(String[] args) {

        // 기본형 vs 참조형 2 - 변수 대입

        // ★ 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다. ★
        // 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사 해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

        // 참조형 대입

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = new Data();

        System.out.println("dataA = " + dataA); // 10
        System.out.println("dataB = " + dataB); // 10
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        // dataA 변경
        dataA.value = 20;

        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        // dataB 변경
        dataB.value = 90;

        System.out.println("dataA.value = " + dataA.value); // 90
        System.out.println("dataB.value = " + dataB.value); // 90

        /*
        * - 변수의 대입은 변수에 들어있는 값을 복사해서 대입한다.
        * - 따라서 dataA 와 dataB 의 참조값은 같기에 같은 인스턴스를 가리킨다.
        * */

    }
}
