package ref;

public class NullMain4 {
    public static void main(String[] args) {

        // NullPointerException

        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null
        System.out.println("bigData.data.value = " + bigData.data.value);
        // java.lang.NullPointerException: Cannot read field "value" because "bigData.data" is null
        // NullPointerException 이 발생하면 null 값에 . (dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.
    }
}
