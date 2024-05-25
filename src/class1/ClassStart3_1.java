package class1;

public class ClassStart3_1 {
    public static void main(String[] args) {

        // Student 클래스를 호출해보자.

        Student student1; // 변수 선언 - String 타입을 받을 수 있는 변수를 선언한다.
        /*
        * 클래스와 사용자 정의 타입
        * - 타입은 데이터의 종류나 형태를 나타낸다.
        * - int 는 정수타입, String 은 문자열 타입이다.
        * - 학생(Student) 이라는 타입을 만들면 되지 않을까?
        * - 클래스를 사용하면 int, String 과 같은 타입을 직접 만들 수 있다.
        * - 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요한데, 설계도가 바로 클래스이다.
        * - 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스 라고 한다.
        * - 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
        * */

        student1 = new Student();
        /*
        * 객체 생성 - Student 인스턴스 생성 , 변수를 사용하는데 필요한 메모리 공간 확보
        * student1 : 참조값 보관소 (객체에 접근할 수 있는 참조값을 가지고 있다.)
        * 참조값을 변수에 보관하는 이유 ?
        * - 객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다.
        * - 단순히 클래스를 기반으로 메모리에 실제 객체를 만드는것이다.
        * - 객체를 생성할때 반환되는 참조값을 어딘가에 보관해둬야 하기에 변수에 저장한것이다.
        * 순서를 확인해보자.
        * Student student1 = new Student(); //1. Student 객체 생성
        * Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환 (임의로 참조값을 x001로 설정한것이다.)
        * student1 = x001; //3. 최종 결과
        * */
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        /*
        * <객체 값 대입>
        * 클래스를 통해 생성한 객체를 사용하려면 먼저 메모리에 존재하는 객체에 접근해야 한다.
        * 객체에 접근하려면 (.)을 사용해야한다.
        * 순서를 확인해보자.
        * student1.name="학생1" //1. student1 객체의 name 멤버 변수에 값 대입
        * x001.name="학생1" //2.변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
        * */

        // 참조값 확인 법
        System.out.println(student1); // class1.Student@119d7047
        System.out.println(student2); // class1.Student@776ec8df

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
        /*
        * <객체 값 읽기>
        * 1. 객체 값 읽기
        * System.out.println("이름:" + student1.name);
        * 2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, name 멤버 변수에 접근한다.
        * System.out.println("이름:" + x001.name);
        * 3. 객체의 멤버 변수의 값을 읽어옴
        * System.out.println("이름:" + "학생1")
        * */

        /*
        * <클래스, 객체, 인스터스 용어 정리>
        * 클래스 (Class)
        * - 객체를 생성하기 위한 틀 또는 설계도이다.
        * - 클래스는 객체가 가져야 할 변수와 메서드를 정의한다.
        * - 참고 설명 -> 붕어빵 틀을 생각해보자. 붕어빵 틀은 붕어빵이 아니다.
        *               실제 먹을 수 있는 팥 붕어빵을 객체 또는 인스턴스라 한다
        * 객체 (Object)
        * - 객체는 클래스에서 정의한 속성과 기능을 가진 실체이다.
        * - 객체는 서로 독립적인 상태를 가진다.
        * -  student1 과 student2 는 같은 클래스에서 만들어졌지만, 서로 다른 객체이다.
        * 인스턴스 (Instance)
        * - 인스턴스는 특정 클래스로부터 생성된 객체를 의미한다.
        * -  예를 들어서 student1 객체는 Student 클래스의 인스턴스라고 표현한다.
        * 객체 vs 인스턴스
        * - student1 은 객체이지만, 이 객체가 Student 클래스로부터 생성되었다는 점을 명확히 하기 위해
        *   student1 을 Student 의 인스턴스라고 부른다
        * */
    }
}
