import java.io.*;
import java.util.*;
import java.math.*;

/*
 * LeetCode.com
 *
 * Given n, how many structurally unique BST's (binary search trees) that
 * store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 *
 * Solution: Catalan Number
 * Formula: (2n)! / [ n! * (n+1)!]
 *
 */


class UniqueBSTs {
  public static void main(String[] args) {
    int n = 3;
    int res = numTrees(n);
    System.out.println(res);
  }

  public static int numTrees(int n){

    BigInteger numer = new BigInteger("1");
    for(int i = 1; i <= 2*n; i++){
      numer = numer.multiply(BigInteger.valueOf(i));
    }

    BigInteger denom1 = new BigInteger("1");
    for(int i = 1; i <= n; i++){
      denom1 = denom1.multiply(BigInteger.valueOf(i));
    }

    BigInteger denom2 = denom1.multiply(BigInteger.valueOf(n+1));
    BigInteger denom = denom1.multiply(denom2);
    BigInteger res = numer.divide(denom);
    int ans = res.intValue();

    return ans;
  }
}
