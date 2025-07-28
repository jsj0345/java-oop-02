package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생.

        // .(dot)은 주소를 찾아가는데 null이니까 주소가 없음.

        // 주소가 없으니까 Java가 예외를 터트림.

        System.out.println("data = "+data.value);

    }
}
