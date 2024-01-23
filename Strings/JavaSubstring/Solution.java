package Strings.JavaSubstring;
/**
 * JavaSubstring
 * https://www.hackerrank.com/challenges/java-substring/problem
 * @Author Joshua Anderson @jdoasvhiuda
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    printSubstring(S, start, end);
  }

  public static void printSubstring(String s, int start, int end) {
    String result = "";
    result = s.substring(start, end);
    System.out.println(result);
  }
}
