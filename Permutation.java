import java.io.*;
import java.util.*;

/*
 * Given a string, find all permutations of length n where n can be any number
 * between 1 and length of string.
 *
 * Time complexity: O(N!)
 * Permutations of a string cannot be solved in O(N) time since it is an exponential order of solutions
 *
 */

class Permutation {
  public static void main(String[] args) {

    String str = new String("success");
    int output_len = 2;
    permute(str, output_len);

  }

  public static void permute(String str, int res_len) {
    permute("", str, res_len);
  }

  private static void permute(String prefix, String str, int res_len) {
      int len = prefix.length();
      if (len == res_len) System.out.println(prefix);
      else {
          for (int i = 0; i < str.length(); i++)
              permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()), res_len);
      }
  }

}
