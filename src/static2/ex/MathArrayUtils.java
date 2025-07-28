package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

  private MathArrayUtils(){
    // private이여서 인스턴스 생성을 막을 수 있음.
  }

  static int sum(int[] values){
    int total_sum = 0;
    for(int i : values){
      total_sum += i;
    }
    return total_sum;
  }

  static double average(int[] values){

    return (double) sum(values)/values.length;

  }

  static int min(int[] values){
    int min_value = values[0];
    for(int i:values){
      if(min_value > i){
        min_value = i;
      }
    }

    return min_value;

  }

  static int max(int[] values){
    int max_value = values[0];
    for(int i:values){
      if(max_value < i){
        max_value = i;
      }
    }

    return max_value;

  }


}
