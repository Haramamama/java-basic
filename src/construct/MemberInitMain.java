package construct;

public class MemberInitMain {
    public static void main(String[] args) {

        // 생성자

        // 생성자가 왜 필요할까?

        MemberInit member1 = new MemberInit(); // 기본 생성자 호출된것임.

        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();

        member2.name = "user2";
        member2.age = 16;
        member2.grade = 70;

        MemberInit[] members = {member1 , member2};

        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }

        /*
        * 회원 객체를 생성하고 나면 name, age, grade 변수에 초기값을 설정한다.
        * 이 코드에는 회원의 초기값을 설정하는 부분이 계속해서 반복되기에 메서드를 통해 반복을 제거해보자.
        * */
    }
}
