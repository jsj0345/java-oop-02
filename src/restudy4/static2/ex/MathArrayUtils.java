package restudy4.static2.ex;

public class MathArrayUtils {

  private MathArrayUtils() {
    // private 인스턴스 생성을 막는다.
  }

  static int sum(int[] values){
    int sum = 0;
    for(int i : values){
      sum+=i;
    }
    return sum;
  }

  static double average(int[] values){
    int sum = 0;
    for(int i : values){
      sum+=i;
    }
    return (double) sum / values.length;
  }

  static int min(int[] values){
    int a = values[0];
    for(int i=0; i<values.length; i++){
      if(a > values[i]){
        a = values[i];
      }
    }
    return a;
  }

  static int max(int[] values){
    int a = values[0];
    for(int i=0; i<values.length; i++){
      if(a < values[i]){
        a = values[i];
      }
    }
    return a;
  }

}
