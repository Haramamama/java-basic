package construct;

public class ConstructMain2 {
    public static void main(String[] args) {

        // 생성자 오버로딩과 this()
        // 생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제공할 수 있다.

        MemberConstruct2 member1 = new MemberConstruct2("user1", 15, 90);
        MemberConstruct2 member2 = new MemberConstruct2("user2", 16);

        MemberConstruct2[] members = {member1, member2};

        for (MemberConstruct2 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }

        /*
        * 성자를 오버로딩 한 덕분에 성적 입력이 꼭 필요한 경우에는 grade 가 있는 생성자를 호출하면 되고,
        * 그렇지 않은 경우에는 grade 가 없는 생성자를 호출하면 된다.
        * grade 가 없는 생성자를 호출하면 성적은 50 점이 된다.
        * */

        // 중복되는 코드를 수정해보자.
    }

}
