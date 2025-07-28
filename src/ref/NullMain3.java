package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        // 참조값으로 클래스 멤버 변수에 접근 할 때, 멤버변수에 초기화 된 값이 없으면 0으로.
        System.out.println("bigData.data=" + bigData.data);
        // 참조값으로 클래스 멤버 변수에 접근 할 때, 기본형이 아닌 참조형인데 초기화가 안되어있으면 Null로 초기화.

        System.out.println("bigData.data.value="+bigData.data.value);
        // null.value
    }

}
