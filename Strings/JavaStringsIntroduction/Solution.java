package Strings.JavaStringsIntroduction;

/**
 * JavaStringsIntroduction
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 * @Author Joshua Anderson @jdoasvhiuda
 */
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    /* Enter your code here. Print output to STDOUT. */
    // print sum of lengths
    System.out.println(A.length() + B.length());
    // print Yes if A is lexicogically greater than B, based on the first 2
    // characters
    if (A.charAt(0) > B.charAt(0)) {
      System.out.println("Yes");
    } else if (A.charAt(0) == B.charAt(0) && A.charAt(1) > B.charAt(1)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    // Capitalize the first letter of A & B, then print both seperated by a space
    String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
    String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
    String output = outputA + " " + outputB;
    System.out.println(output);

  }
}
