package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 값을 단순히 복사해서 갖고 온거기에 a자체는 변하지 않는다.

    }

    public static void changePrimitive(int x){ // x에는 a에 있는 10이라는 값이 복사 되서 들어가는것.
        x = 20;
    }
}
