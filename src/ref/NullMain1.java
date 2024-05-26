package ref;

import java.util.Date;

public class NullMain1 {
    public static void main(String[] args) {

        // null
        /*
        * 참조형 변수에서 아직 가리키는 대상이 없다면 null 을 사용한다.
        * null 은 값이 존재하지 않는, 없다는 뜻이다.
        * */

        Data data = null;
        System.out.println("1. data = " + data); // null
        data = new Data();
        System.out.println("2. data = " + data); // ref.Data@41629346
        data = null;
        System.out.println("3. data = " + data); // null
    }
}
