package InterviewPreparationKit.TimeConversion;

/**
 * TimeConversion
 * https://www.hackerrank.com/challenges/time-conversion/problem
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
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String timeConversion(String s) {
    // Write your code here
    List<Character> timeSet = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
    if ((timeSet.get(8) == 'A' || timeSet.get(8) == 'a') && timeSet.get(0) == '1' && timeSet.get(1) == '2') {
      timeSet.set(0, '0');
      timeSet.set(1, '0');
    } else if ((timeSet.get(8) == 'P' || timeSet.get(8) == 'p') && (timeSet.get(0) != '1' || timeSet.get(1) != '2')) {
      timeSet.set(0, (char) (timeSet.get(0) + 1));
      timeSet.set(1, (char) (timeSet.get(1) + 2));
    }
    timeSet.remove(9);
    timeSet.remove(8);
    String result = "";
    for (char c : timeSet) {
      result += c;
    }
    return result;

  }

}

// public class Solution {
// public static void main(String[] args) throws IOException {
// BufferedReader bufferedReader = new BufferedReader(new
// InputStreamReader(System.in));
// BufferedWriter bufferedWriter = new BufferedWriter(new
// FileWriter(System.getenv("OUTPUT_PATH")));

// String s = bufferedReader.readLine();

// String result = Result.timeConversion(s);

// bufferedWriter.write(result);
// bufferedWriter.newLine();

// bufferedReader.close();
// bufferedWriter.close();
// }
// }
