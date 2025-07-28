package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a= "+ a); // a=10
        System.out.println("b= "+ b); // b=10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // a= 20
        System.out.println("b = " + b); // b= 10

        // a값만 변경 됐으니 b는 영향 x

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // a = 20
        System.out.println("b = " + b); // b = 30

        // b값만 변경 했으니 a는 영향 x.


        /*
        이 코드의 핵심은 int b = a라고 했을 때 변수에 들어있는 값을 복사해서 전달한다는 점이다.
        따라서 a=20, b=30이라고 했을 때 각각 본인의 값만 변경되는 것을 확인 할 수 있다.
        즉, a자체가 b가 되는게 아니라 a에 있는 값을 b에 넣는다. 라는게 중요함.
         */


    }
}
