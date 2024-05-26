package ref;

public class MethodChange1 {
    public static void main(String[] args) {

        // 기본형 vs 참조형 3 - 메서드 호출

        // ★ 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다. ★
        // 메서드를 호출할때 매개변수에 값을 전달하는것도 값을 복사해서 전달한다.

        int a = 10;
        System.out.println("메서드 호출 전 = " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 = " + a); // 10

    }

    public static void changePrimitive(int x){
        x = 20; // 메서드가 종료되면 매개변수 x 는 제거된다.
    }
}
