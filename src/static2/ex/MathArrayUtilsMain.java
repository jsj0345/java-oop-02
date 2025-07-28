package static2.ex;

public class MathArrayUtilsMain {
  public static void main(String[] args) {
    int[] values = new int[]{1,2,3,4,5};
    System.out.println("sum="+MathArrayUtils.sum(values));
    // Alt+Enter로 자동으로 메서드 만들어보기
    System.out.println("average="+MathArrayUtils.average(values));
    System.out.println("min="+MathArrayUtils.min(values));
    System.out.println("max="+MathArrayUtils.max(values));
  }
}
