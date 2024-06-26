package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        // 배열 도입
        // 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리하기 위해 사용한다.

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

        /*
        * <배열에 참조값 대입>
        * Student[] students = new Student[2];
        * - Student 변수를 2개 보관할 수 있는 사이즈 2의 배열을 만든것이다.
        * - Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
        * - 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null 값으로 초기화 된다.
        * <배열에 객체 보관> ★ 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다 ★
        - students[0] = student1; -> students[0] = x001;
        - students[1] = student2; -> students[1] = x002;
        * ★ 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다 ★
        * - 자바에서 변수의 대입( = )은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
        * - 기존 student1 , student2 에 들어있던 참조값은 당연히 그대로 유지된다.
        * - 변수에는 인스턴스 자체가 들어있는 것이 아니다. 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다.
        * - 따라서 대입 시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다
        * <배열에 들어있는 객체 사용> - 학생 1을 예제로 살펴보자.
        * - System.out.println(students[0].name); //배열 접근 시작
        * - System.out.println(x005[0].name); //[0]를 사용해서 x005 배열의 0번 요소에 접근
        * - System.out.println(x001.name); //.을 사용해서 참조값으로 객체에 접근
        * - System.out.println("학생1")
        * */
    }
}
