package ref;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("학생1" , 15, 90);
        Student student2 = createStudent("학생2" , 16, 80);
        /*
        * 반환된 참조값을 student2 변수에 저장
        * student2 을 통해 Student 인스턴스를 사용할 수 있다.
         * */

        printStudent(student1);
        printStudent(student2);

    }

    public static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;

        /*
        * createStudent() 라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드 안에 함께 포함했다.
        * 이 메서드 하나로 객체의 생성과 초기값 설정을 모두 처리한다.
        * 그런데 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 밖에서 사용할 수 있게 돌려줘야한다.
        * 그래야 메서드 밖에서 이 객체를 사용할 수 있다.
        * 따라서 return 을 통하여 반환기능을 사용하여 만들어진 객체의 참조값을 메서드 밖으로 반환한다.
        * 메서드 내부에서 인스턴스를 생성한 후에 참조값을 메서드 외부로 반환했다.
        * 이 참조값으로 해당 인스턴스에 접근할 수 있다.
        * */
    }

    public static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }

}
