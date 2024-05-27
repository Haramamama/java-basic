package construct;

public class MemberConstruct2 {

    String name;
    int age;
    int grade;
    //추가
    MemberConstruct2(String name, int age) {
        this(name, age, 50); //변경 -> 무조건 첫줄에 써야한다.
        /*
        this.name = name;
        this.age = age;
        this.grade = 50;
        */
    }
    MemberConstruct2(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
