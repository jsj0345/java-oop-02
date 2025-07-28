package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = "+data.value1); // InitData 클래스에서 value1은 초기화 하지 않았음.
        // 결과는?
        System.out.println("value2 = "+data.value2); // InitData 클래스에서 value2는 10으로 초기화함. 결과는?

        /*
        이 코드에서 말하고자 하는 바는 다음과 같다.
        원래 코드를 작성할 때, int value; 이렇게 작성하고 나서
        System.out.println(value);를 작성하면 에러가 난다.

        그런데 만약에 클래스를 생성하고나서 멤버 변수에 변수만 선언하고 값을 초기화 하지 않은 상태에서
        다른 클래스에서 참조변수가 있는 변수에다가 이전에 초기화 하지 않은 멤버 변수를 호출한다고 하면 오류가 나야 하는게 정상이지만 오류가 안 난다.
         */
    }
}
