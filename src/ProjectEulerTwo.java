/**
 * Created by Jack on 2/1/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    double first = 1;
    double second = 1;
    double newNum;
    double sum = 0;

    while(true){
      if(first > 4000000){
        break;
      }
      //check if first is even, add to sum if it is.
      if(first % 2 == 0){
        sum += first;
      }
      newNum = first + second;
      first = second;
      second = newNum;
    }

    System.out.println(sum);
  }
}
