package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {

        // 생성자

        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1,member2};

        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }

    }
    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

    /*
    * initMember 메서드를 사용해서 반복을 제거.
    * 그런데 이 메서드는 대부분 MemberInit 객체의 멤버 변수를 사용한다.
    * 따라서 MemberInit 이 자기 자신의 데이터를 변경하는 기능(메서드)을 제공하는 것이 좋다.
    * */

    // 생성자는 객체 생성 직후 객체를 초기화 하기 위한 특별한 메서드로 생각할 수 있다
}
