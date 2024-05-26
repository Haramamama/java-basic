package ref;

public class Method1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90); // 전달한 학생 객체의 필드에 값을 설정한다.

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1); // 전달한 학생 객체의 필드 값을 읽어서 출력한다.
        printStudent(student2);

    }

    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;

        /*
        - student1 이 참조하는 Student 인스턴스에 값을 편리하게 할당하고 싶어서 initStudent() 메서드를 만듦.
        - 이 메서드를 호출하면서 student1 을 전달한다.
        - 그러면 student1 의 참조값이 매개변수 student 에 전달된다.
        - 이 참조값을 통해 initStudent() 메서드 안에서 student1 이 참조하는 것과 동일한 Student 인스턴스에 접근하고 값을 변경할 수 있다.
        */
    }

    public static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }

}
