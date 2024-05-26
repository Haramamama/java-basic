package ref;

public class NullMain3 {
    public static void main(String[] args) {

        // NullPointerException

        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null

        /*
        * BigData 의 data 멤버 변수는 참조형이므로 null 로 초기화 된다.
        * count 멤버 변수는 숫자이므로 0으로 초기화된다.
        * */
    }
}
