package ref;

public class VarChange2 {
    public static void main(String[] args) {

        // 기본형 vs 참조형 2 - 변수 대입

        // ★ 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다. ★
        // 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사 해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

        // 기본형 대입

        int a = 10;
        int b = a;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        // a 값 변경

        a = 20;

        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        // b 값 변경

        b = 50;

        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 50

    }
}
