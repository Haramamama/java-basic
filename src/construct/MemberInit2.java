package construct;

public class MemberInit2 {

    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
     * initMember 의 코드를 보면
     * 메서드의 매개변수에 정의한 String name 과 Member 의 멤버 변수의 이름이 String name 으로 둘다 똑같다.
     * <멤버 변수와 메서드의 매개 변수의 이름이 같으면 어떻게 구분할까 ?>
     * - 이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
     * - 따라서 initMember 메서드 안에서 name 이라고 적으면 매개변수에 접근하게 된다.
     * - 멤버 변수에 접근하려면 앞에 this. 이라고 해주면 된다. 여기서 this 는 인스턴스 자신의 참조값을 가리킨다.
     * */

    /*
     * 매개변수의 이름과 맴버 변수의 이름이 같은 경우 this 를 사용해서 둘을 명확하게 구분해야 한다.
     * this 는 인스턴스 자신을 가리킨다
     * */
}
