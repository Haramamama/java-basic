package construct;

public class ConstructMain1 {
    public static void main(String[] args) {

        // 생성자 호출

        MemberConstruct1 member1 = new MemberConstruct1("user1", 15, 90);
        MemberConstruct1 member2 = new MemberConstruct1("user2", 16, 80);

        MemberConstruct1[] members = {member1, member2};

        for (MemberConstruct1 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }

        /*
        * - 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
        * - 생성자를 호출하는 방법은 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달한다.
        * */

        /*
        * 생성자 장점
        * - 중복 호출 제거
        * - 제약이 걸려있음 (생성자 호출 필수) -> 오류가 발생해도 한번에 알아차릴 수 있다.
        * - 객체를 생성할때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야한다.
        * */
    }
}
