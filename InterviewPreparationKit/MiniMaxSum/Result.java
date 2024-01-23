package InterviewPreparationKit.MiniMaxSum;
/**
 * MiniMaxSum
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 * @Author Joshua Anderson @jdoasvhiuda
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long sumMax = 0;
    int max = 0;
    int min = 0;
    for (int i : arr) {
      if (i < min || min == 0) {
        min = i;
      }
      if (i > max) {
        max = i;
      }
      sumMax += i;
    }
    long sumMin = sumMax - max;
    sumMax -= min;
    System.out.printf("%s %s", sumMin, sumMax);

  }

}

// public class Solution {
//   public static void main(String[] args) throws IOException {
//     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//     List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//         .map(Integer::parseInt)
//         .collect(toList());

//     Result.miniMaxSum(arr);

//     bufferedReader.close();
//   }
// }
