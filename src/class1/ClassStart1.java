package class1;

public class ClassStart1 {
    public static void main(String[] args) {

        // 클래스

        // 클래스가 필요한 이유 ?

        /*
        * 다음 문제를 풀어보자.
        * 요구 사항:
        * 1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
        * 2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
        * 3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
        * 4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다
        * */

        String studentName1 = "학생1";
        int studentAge1 = 15;
        int studentGrade1 = 90;

        String studentName2 = "학생2";
        int studentAge2 = 16;
        int studentGrade2 = 80;

        System.out.println("이름 : " + studentName1 + " 나이 : " + studentAge1 + " 성적 : " + studentGrade1);
        System.out.println("이름 : " + studentName2 + " 나이 : " + studentAge2 + " 성적 : " + studentGrade2);

        // 학생이 늘어날때마다 변수와 출력문을 계속해서 추가해야하는 어려움이 있다.
        // 그렇다면 배열을 사용해볼까..?
    }
}
