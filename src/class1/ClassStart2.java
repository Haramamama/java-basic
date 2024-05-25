package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        // 클래스

        // 그렇다면 배열을 사용해볼까..?

        String[] studentNames = {"학생1" , "학생2"};
        int[] studentAges = {15,16};
        int[] studentGrade = {90,80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrade[i]);
        }

        /*
        * 배열 사용으로 인해 코드가 간결해졌지만
        * 한 학생의 데이터가 3개의 배열에 나누어져있다. (studentNames, studentAges, studentGrade)
        * 따라서 데이터를 변경할때 조심해서 작업해야하는 어려움이 있다.
        * */

        // 그렇다면 데이터를 한번에 묶어서 관리하는 방법은 없을까 ? - Student 클래스로 이동
    }
}
